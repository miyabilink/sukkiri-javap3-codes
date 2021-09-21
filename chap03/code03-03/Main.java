import java.util.*;

public class Main {
  public static void partyInfo(Set<Hero> party, Hero leader, String pName) {
    System.out.println(pName + "パーティーのリーダーは" + leader.getName());
    System.out.print("パーティーメンバーは ");
    for (Hero h : party) {
      System.out.print(h.getName() + " ");
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    Hero h1 = new Hero("ミナト");
    Hero h2 = new Hero("アサカ");
    Hero h3 = new Hero("スガワラ");
    Set<Hero> party = new HashSet<>();
    party.add(h1);
    party.add(h2);
    party.add(h3);
    PartyInfoConsumer func = Main::partyInfo;
    func.process(party, h1, "スッキリ");
  }
}
