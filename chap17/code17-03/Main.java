import java.awt.FlowLayout;
import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("はじめてのSwing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    /* コード17-3ここから */
    frame.setLayout(null);
    JLabel label = new JLabel("Hello World!!");
    label.setLocation(10, 10);                   // ラベルの座標と、
    label.setSize(200, 20);                      // サイズを指定
    frame.add(label);
    JButton button = new JButton("押してね");
    button.setLocation(250, 100);                // ボタンの座標と、
    button.setSize(100, 20);                     // サイズを指定
    frame.add(button);
    /* コード17-3ここまで */
    frame.setVisible(true);
    System.out.println("フレームを表示");
  }
}
