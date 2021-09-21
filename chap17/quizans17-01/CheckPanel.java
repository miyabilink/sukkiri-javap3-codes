import java.awt.*;
import javax.swing.*;

public class CheckPanel extends JPanel {
  JCheckBox check = new JCheckBox("パスワードを隠さない");

  public CheckPanel() {
    this.setLayout(new BorderLayout());
    this.add(check, BorderLayout.WEST);
  }
}
