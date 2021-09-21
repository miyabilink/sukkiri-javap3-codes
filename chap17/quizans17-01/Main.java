import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("ログイン画面");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    frame.add(new IDPanel());
    frame.add(new PWPanel());
    frame.add(new CheckPanel());
    frame.add(new ButtonPanel());

    frame.setVisible(true);
  }
}
