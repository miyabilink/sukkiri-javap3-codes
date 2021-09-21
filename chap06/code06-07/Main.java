import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    baos.write(65);
    baos.write(66);
    byte[] data = baos.toByteArray();
    for (byte b : data) {
      System.out.println(b);
    }
  }
}
