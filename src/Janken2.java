import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Janken2 extends JFrame {

    JLabel playerLabel, cpuLabel, resultLabel;
    String[] hands = {"グー", "チョキ", "パー"};
    ImageIcon[] icons = {
        new ImageIcon(getClass().getResource("/img/gu.png")),
        new ImageIcon(getClass().getResource("/img/choki.png")),
        new ImageIcon(getClass().getResource("/img/pa.png"))
    };

    public Janken2() {
        setTitle("じゃんけんゲーム");
        setSize(600, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10)); // 余白追加
        setLocationRelativeTo(null); // 画面中央に表示

        // じゃんけんボタンパネル
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 0));
        for (int i = 0; i < 3; i++) {
            JButton btn = new JButton(icons[i]);
            final int playerHand = i;
            btn.addActionListener(e -> playJanken(playerHand));
            buttonPanel.add(btn);
        }
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        playerLabel = new JLabel("あなた: ", JLabel.CENTER);
        playerLabel.setFont(new Font("SansSerif", Font.BOLD, 20));

        cpuLabel = new JLabel("コンピュータ: ", JLabel.CENTER);
        cpuLabel.setFont(new Font("SansSerif", Font.BOLD, 20));

        resultLabel = new JLabel("結果: ", JLabel.CENTER);
        resultLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        resultLabel.setForeground(new Color(0, 102, 204)); // 青色

        JPanel infoPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        infoPanel.add(playerLabel);
        infoPanel.add(cpuLabel);
        infoPanel.add(resultLabel);

        add(buttonPanel, BorderLayout.NORTH);
        add(infoPanel, BorderLayout.CENTER);
    }

    private void playJanken(int player) {
        int cpu = new Random().nextInt(3);

        String[] steps = {"最初はグー...", "じゃんけん...", "ポン！"};
        int delay = 700;
        final int[] step = {0};

        Timer timer = new Timer(delay, null);
        timer.addActionListener(e -> {
            if (step[0] < steps.length) {
                resultLabel.setText(steps[step[0]]);
                step[0]++;
            } else {
                playerLabel.setText("あなた: " + hands[player]);
                cpuLabel.setText("コンピュータ: " + hands[cpu]);
                resultLabel.setText("結果: " + judge(player, cpu));
                timer.stop();
            }
        });

        timer.setInitialDelay(0);
        timer.start();
    }

    private String judge(int p, int c) {
        if (p == c)
            return "あいこ";
        if ((p == 0 && c == 1) || (p == 1 && c == 2) || (p == 2 && c == 0))
            return "あなたの勝ち！";
        else
            return "あなたの負け...";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Janken2().setVisible(true));
    }
}

