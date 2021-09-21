import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.print("利用中のJavaバージョン：");
    System.out.println(System.getProperty("java.version"));

    Properties p = System.getProperties();
    Iterator<String> i = p.stringPropertyNames().iterator();
    System.out.println("システムプロパティ一覧");
    while (i.hasNext()) {
      String key = i.next();
      System.out.print(key + " = ");
      System.out.println(System.getProperty(key));
    }
  }
}
