import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    SaveCSV sc = new SaveCSV();
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = "75";
    h.mp = "18";
    sc.saveHeroToFile(h);
  }
}
