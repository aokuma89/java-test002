import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwing_Test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swingの例");

            JLabel label = new JLabel("ようこそJava の世界へ", JLabel.CENTER);
            label.setFont(new Font("Serif", Font.PLAIN, 24));

            JButton button = new JButton("クリックして文字を変更");


            button.addActionListener((ActionEvent e) -> {
                label.setText("こんにちは、Swing!");
            });

            frame.setLayout(new BorderLayout());
            frame.add(label, BorderLayout.CENTER);
            frame.add(button, BorderLayout.SOUTH);

            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}