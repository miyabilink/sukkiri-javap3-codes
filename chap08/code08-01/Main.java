import java.io.*;
import java.net.*;

public class Main {
  public static void main(String[] args) throws IOException {
    URL url = new URL("https://dokojava.jp");
    InputStream is = url.openStream();
    InputStreamReader isr = new InputStreamReader(is);
    int i = isr.read();
    while (i != -1) {
      System.out.print((char)i);
      i = isr.read();
    }
    isr.close();
  }
}
