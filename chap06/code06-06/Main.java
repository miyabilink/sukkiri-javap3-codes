import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    String msg = "第1土曜日は資源ゴミの回収です。";
    Reader sr = new StringReader(msg);
    System.out.print((char)sr.read());
    System.out.print((char)sr.read());
    /* : */
  }
}
