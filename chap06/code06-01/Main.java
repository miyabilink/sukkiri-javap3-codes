import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("c:\\rpgsave.dat", true);
    fw.write('A');
    fw.flush();
    fw.close();
  }
}
