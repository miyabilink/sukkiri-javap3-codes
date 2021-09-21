import javax.swing.*;

public class ButtonPanel extends JPanel {
  JButton login = new JButton("ログイン");
  JButton clear = new JButton("クリア");

  public ButtonPanel() {
    this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    this.add(login);
    this.add(clear);
  }
}
