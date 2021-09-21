import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("はじめてのSwing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setLayout(new FlowLayout());

    JLabel label = new JLabel("Hello World!!");
    frame.add(label);
    JButton button = new JButton("押してね");
    /* コード17-7ここから */
    button.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        System.out.println("クリックされました！");
      }
    });
    /* コード17-7ここまで */
    frame.add(button);

    frame.setVisible(true);
    System.out.println("フレームを表示");
  }
}
