import java.awt.*;
import javax.swing.*;

public class IDPanel extends JPanel {
  JLabel label = new JLabel("ユーザーID");
  JTextField id = new JTextField();

  public IDPanel() {
    this.setLayout(new BorderLayout());
    this.add(label, BorderLayout.WEST);
    this.add(id, BorderLayout.CENTER);
  }
}
