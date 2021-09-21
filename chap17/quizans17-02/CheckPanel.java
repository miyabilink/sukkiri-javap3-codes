import java.awt.*;
import javax.swing.*;

public class CheckPanel extends JPanel {
  JCheckBox check = new JCheckBox("パスワードを隠さない");

  public CheckPanel(PWPanel pwpanel) {
    this.setLayout(new BorderLayout());
    this.add(check, BorderLayout.WEST);
    check.addChangeListener(e -> {
      if (check.isSelected()) {
        pwpanel.showText();
      } else {
        pwpanel.hideText();
      }
    });
  }
}
