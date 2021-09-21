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

  public String getText() {
    return this.id.getText();
  }
  public void setText(String newValue) {
    this.id.setText(newValue);
  }
}
