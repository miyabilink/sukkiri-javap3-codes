public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;

    System.out.println(h1.hashCode());
  }
}
