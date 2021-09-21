import java.awt.*;
import javax.swing.*;

public class PWPanel extends JPanel {
  JLabel label = new JLabel("パスワード");
  JPasswordField pw = new JPasswordField();

  public PWPanel() {
    this.setLayout(new BorderLayout());
    this.add(label, BorderLayout.WEST);
    this.add(pw, BorderLayout.CENTER);
    this.hideText();
  }

  public void hideText() { pw.setEchoChar('★'); }
  public void showText() { pw.setEchoChar((char)0); }

  public String getText() {
    return String.valueOf(this.pw.getPassword());
  }
  public void setText(String newValue) {
    this.pw.setText(newValue);
  }
}
