import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ItemShop_Test {
  public static void main(String[] args) {
    JFrame frame = new JFrame("道具屋");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    frame.setLocationRelativeTo(null);

    JPanel panel = new JPanel();

    String[] items = {"やくそう", "どくけしそう", "まほうのせいすい", "せいなるナイフ"};
    int[] stock = {3, 2, 1, 100};

    ArrayList<String> history = new ArrayList<>();

    JLabel messageLabel = new JLabel("アイテムどれが欲しいですか？");
    JLabel itemListLabel = new JLabel(getItemList(items, stock));

    JLabel label = new JLabel("アイテム番号を入力:");
    JTextField input = new JTextField(5);
    JButton buyButton = new JButton("購入する");
    JButton historyButton = new JButton("履歴を見る");
    JLabel resultLabel = new JLabel("ここにメッセージが表示されます");

    buyButton.addActionListener(e -> {
      try {
        int index = Integer.parseInt(input.getText());
        
        if (stock[index] > 0) {
          stock[index]--;
          history.add(items[index]);
          resultLabel.setText("「" + items[index] + "」を購入しました！");
          itemListLabel.setText(getItemList(items, stock));
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

  private static String getItemList(String[] items, int[] stock) {
    StringBuilder sb = new StringBuilder("<html>");
    for (int i = 0; i < items.length; i++) {
      sb.append(i).append(": ").append(items[i]).append("（在庫: ").append(stock[i]).append("）<br>");
    }
    sb.append("</html>");
    return sb.toString();
  }
}

