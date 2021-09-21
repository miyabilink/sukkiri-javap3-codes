import java.io.*;
import java.net.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Socket sock = new Socket("smtp.example.com", 60025);
    OutputStream os = sock.getOutputStream();
    os.write("HELO example.com\r\n".getBytes());
    /* ： */ /* 8行目と同じ手順で、データの各行をos.write()で書き込む処理 */
    os.flush();
    sock.close();
  }
}
