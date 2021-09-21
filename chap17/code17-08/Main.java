import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.nio.file.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("はじめてのSwing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setLayout(new FlowLayout());

    JLabel label = new JLabel("Hello World!!");
    frame.add(label);
    JButton button = new JButton("押してね");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        try (
          BufferedReader br = Files.newBufferedReader(Paths.get("rpg.txt"));
        ) {
          label.setText(br.readLine());
        } catch (IOException e) {
          JOptionPane.showMessageDialog(frame,
              "rpg.txtファイルを開けませんでした",
              "エラー発生",  JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    frame.add(button);

    frame.setVisible(true);
    System.out.println("フレームを表示");
  }
}
