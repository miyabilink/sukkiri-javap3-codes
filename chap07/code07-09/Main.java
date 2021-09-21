import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    InputStream is = new FileInputStream("rpgsave.xml");
    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);  // (1)
    Element hero = doc.getDocumentElement();            // (2)
    Element weapon = findChildByTag(hero, "weapon");    // (3)
    Element power = findChildByTag(weapon, "power");    // (4)
    String value = power.getTextContent();              // (5)
  }
  // 指定された名前を持つタグの最初の子タグを返す
  static Element findChildByTag(Element self, String name) throws Exception {
    NodeList children = self.getChildNodes();           // すべての子を取得
    for (int i = 0; i < children.getLength(); i++) {
      if (children.item(i) instanceof Element) {
        Element e = (Element)children.item(i);
        if (e.getTagName().equals(name)) {              // タグ名を照合
          return e;
        }
      }
    }
    return null;
  }
}
