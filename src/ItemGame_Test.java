import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ItemGame_Test extends JFrame {

  private HashMap<String, Integer> itemMap = new HashMap<>();
  private LinkedList<String> history = new LinkedList<>();
  private HashMap<String, Integer> usageCountMap = new HashMap<>();

  private JTextArea logArea;

  public ItemGame_Test() {
    setTitle("アイテム使用ゲーム");
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    itemMap.put("薬草", 50);
    itemMap.put("爆弾", 100);
    itemMap.put("聖水", 30);
    itemMap.put("エリクサー", 200);

    JPanel topPanel = new JPanel();
    JButton useButton = new JButton("アイテムを使う");
    JButton undoButton = new JButton("取り消す");
    JButton historyButton = new JButton("全部の履歴を表示する");

    topPanel.add(useButton);
    topPanel.add(undoButton);
    topPanel.add(historyButton); 
    add(topPanel, BorderLayout.NORTH);

    logArea = new JTextArea();
    logArea.setEditable(false);
    add(new JScrollPane(logArea), BorderLayout.CENTER);

    useButton.addActionListener(e -> {
      Object[] itemNames = itemMap.keySet().toArray();
      String selected = (String) JOptionPane.showInputDialog(
          this,
          "使うアイテムを選んでください：",
          "アイテム選択",
          JOptionPane.PLAIN_MESSAGE,
          null,
          itemNames,
          itemNames[0]
      );

      if (selected != null && itemMap.containsKey(selected)) {
        int effect = itemMap.get(selected);
        history.add(selected);
        usageCountMap.put(selected, usageCountMap.getOrDefault(selected, 0) + 1);
        logArea.append(selected + " を使った（効果値：" + effect + "）\n");
      }
    });

    undoButton.addActionListener(e -> {
      if (!history.isEmpty()) {
        String last = history.removeLast();
        usageCountMap.put(last, Math.max(usageCountMap.getOrDefault(last, 1) - 1, 0));
        logArea.append("取り消した操作: " + last + "\n");
      } else {
        logArea.append("取り消す操作がありません。\n");
      }
    });

    historyButton.addActionListener(e -> {
      if (history.isEmpty()) {
        logArea.append("履歴はまだありません。\n");
      } else {
        logArea.append("▼ 使用履歴一覧 ▼\n");
        for (String item : itemMap.keySet()) {
          int count = usageCountMap.getOrDefault(item, 0);
          logArea.append(item + "： " + count + " 回\n");
        }
      }
    });
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      ItemGame_Test game = new ItemGame_Test();
      game.setVisible(true);
    });
  }
}
