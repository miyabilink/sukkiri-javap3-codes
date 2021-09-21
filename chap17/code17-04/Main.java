import java.awt.BorderLayout;
import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("はじめてのSwing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);

    frame.setLayout(new BorderLayout());

    JLabel label = new JLabel("Hello World!!");
    frame.add(label, BorderLayout.CENTER);
    JButton buttonN = new JButton("上ボタン");
    frame.add(buttonN, BorderLayout.NORTH);
    JButton buttonS = new JButton("下ボタン");
    frame.add(buttonS, BorderLayout.SOUTH);
    JButton buttonW = new JButton("左ボタン");
    frame.add(buttonW, BorderLayout.WEST);
    JButton buttonE = new JButton("右ボタン");
    frame.add(buttonE, BorderLayout.EAST);

    frame.setVisible(true);
    System.out.println("フレームを表示");
  }
}
