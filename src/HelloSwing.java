import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swingの例");

            JLabel label = new JLabel("ようこそJava の世界へ", JLabel.CENTER);
            label.setFont(new Font("Serif", Font.PLAIN, 24));

            JButton button = new JButton("クリックして文字を変更");

            // 状態フラグ
            final boolean[] toggled = {false};

            button.addActionListener((ActionEvent e) -> {
                toggled[0] = !toggled[0]; // 状態を切り替える
                if (toggled[0]) {
                    label.setText("こんにちは、Swing！");
                } else {
                    label.setText("ようこそJava の世界へ");
                }
            });

            frame.setLayout(new BorderLayout());
            frame.add(label, BorderLayout.CENTER);
            frame.add(button, BorderLayout.SOUTH);

            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
