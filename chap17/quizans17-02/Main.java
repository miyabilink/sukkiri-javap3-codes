import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("ログイン画面");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    IDPanel idpanel = new IDPanel();
    PWPanel pwpanel = new PWPanel();
    frame.add(idpanel);
    frame.add(pwpanel);
    frame.add(new CheckPanel(pwpanel));
    frame.add(new ButtonPanel(idpanel, pwpanel));

    frame.setVisible(true);
  }
}
