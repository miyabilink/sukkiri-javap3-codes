import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Hero h = new Hero("ミナト", 75, 18);
    h = h.loadHeroFromFile();
    System.out.println("ファイルから読み取った情報は");
    System.out.println(h.name);
    System.out.println(h.hp);
    System.out.println(h.mp);
  }
}
