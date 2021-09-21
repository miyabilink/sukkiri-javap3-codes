import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    ResourceBundle rb = ResourceBundle.getBundle(
        "jp.miyabilink.rpg.rpgdata");
    String heroName = rb.getString("heroName");
    System.out.println("勇者の名前:" + heroName);
  }
}
