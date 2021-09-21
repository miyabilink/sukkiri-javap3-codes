import java.io.*;

public class SaveCSV {
  public void saveHeroToFile(Hero h) throws IOException {
    Writer bw = new BufferedWriter(new FileWriter("rpgsave.dat"));
    /* コード7-2ここから */
    bw.write(h.name);
    bw.write(",");
    bw.write(h.hp);
    bw.write(",");
    bw.write(h.mp);
    /* コード7-2ここまで */
    bw.flush();
    bw.close();
  }
}
