import java.io.*;

public class Main {
  public static void main(String[] args) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("rpgsave.dat", true);
      fw.write('A');
      fw.flush();
    } catch (IOException e) {
      System.out.println("ファイル書き込みエラーです");
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e2) { }
      }
    }
  }
}
