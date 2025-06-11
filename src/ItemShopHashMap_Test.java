import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ItemShopHashMap_Test {

	  public static void main(String[] args) {
	    JFrame frame = new JFrame("道具屋");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400, 250);
	    frame.setLocationRelativeTo(null);

	    JPanel panel = new JPanel();

	    // 商品と在庫をHashMapで管理
	    LinkedHashMap<String, Integer> items = new LinkedHashMap<>();
	    items.put("やくそう", 3);
	    items.put("どくけしそう", 2);
	    items.put("まほうのせいすい", 1);
	    items.put("せいなるナイフ", 1);

	    // 表示順保持のためにキーをリストに格納
	    List<String> itemNames = new ArrayList<>(items.keySet());

	    ArrayList<String> history = new ArrayList<>();

	    JLabel messageLabel = new JLabel("アイテムどれが欲しいですか？");
	    JLabel itemListLabel = new JLabel(getItemList(items, itemNames));

	    JLabel label = new JLabel("アイテム番号を入力:");
	    JTextField input = new JTextField(5);
	    JButton buyButton = new JButton("購入する");
	    JButton historyButton = new JButton("履歴を見る");
	    JLabel resultLabel = new JLabel("ここにメッセージが表示されます");

	    buyButton.addActionListener(e -> {
	      try {
	        int index = Integer.parseInt(input.getText());
	        if (index < 0 || index >= itemNames.size()) {
	          throw new ArrayIndexOutOfBoundsException();
	        }
	        String itemName = itemNames.get(index);
	        int stock = items.get(itemName);

	        if (stock > 0) {
	          items.put(itemName, stock - 1);
	          history.add(itemName);
	          resultLabel.setText("「" + itemName + "」を購入しました！");
	          itemListLabel.setText(getItemList(items, itemNames));
	        } else {
	          resultLabel.setText("そのアイテムは在庫切れです！");
	        }
	      } catch (ArrayIndexOutOfBoundsException ex) {
	        JOptionPane.showMessageDialog(frame, "その番号のアイテムは売っていません！", "エラー",
	            JOptionPane.ERROR_MESSAGE);
	      } catch (NumberFormatException ex) {
	        JOptionPane.showMessageDialog(frame, "番号を半角数字で入力してください！", "入力エラー",
	            JOptionPane.ERROR_MESSAGE);
	      } catch (Exception ex) {
	        JOptionPane.showMessageDialog(frame,
	            "想定外のエラーが発生しました。\n" + ex.toString(),
	            "予期しないエラー",
	            JOptionPane.ERROR_MESSAGE);
	      }
	    });

	    historyButton.addActionListener(e -> {
	      if (history.isEmpty()) {
	        JOptionPane.showMessageDialog(frame, "まだ購入履歴がありません。");
	      } else {
	        StringBuilder sb = new StringBuilder("購入履歴：\n");
	        for (String item : history) {
	          sb.append(item).append("\n");
	        }
	        JOptionPane.showMessageDialog(frame, sb.toString());
	      }
	    });

	    panel.add(messageLabel);
	    panel.add(itemListLabel);
	    panel.add(label);
	    panel.add(input);
	    panel.add(buyButton);
	    panel.add(historyButton);
	    panel.add(resultLabel);

	    frame.add(panel);
	    frame.setVisible(true);
	  }

	  private static String getItemList(LinkedHashMap<String, Integer> items, List<String> itemNames) {
	    StringBuilder sb = new StringBuilder("<html>");
	    for (int i = 0; i < itemNames.size(); i++) {
	      String name = itemNames.get(i);
	      sb.append(i).append(": ").append(name)
	        .append("（在庫: ").append(items.get(name)).append("）<br>");
	    }
	    sb.append("</html>");
	    return sb.toString();
	  }
	}

