import java.util.*;

public class Main {
  public static void main(String args[]) {
    List<Hero> heroes = new ArrayList<>();

    /* heroesの例 */
    Hero h1 = new Hero("ミナト");
    h1.hp = 0;    // 戦闘不能（HP0）
    Hero h2 = new Hero("アサカ");
    h2.hp = 100;
    heroes.add(h1);
    heroes.add(h2);

    boolean anyoneKnockedOut = heroes.stream().anyMatch(h -> h.hp == 0);

    if (anyoneKnockedOut == true) {
      System.out.println("パーティに戦闘不能の勇者がいます");
    } else {
      System.out.println("パーティ全員が戦闘可能です");
    }
  }
}
