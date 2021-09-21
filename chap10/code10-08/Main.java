import com.opencsv.*;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("スッキリ魔王征伐 ver1.0.0 by minato");
    System.out.println("Mavenで鋭意開発中！待て次号！");

    CSVWriter writer = new CSVWriter(new FileWriter("rpgdata.csv"), ',');
    String[] data = {"sukkiri-quest", "1.0.0"};
    writer.writeNext(data);
    writer.close();
  }
}
