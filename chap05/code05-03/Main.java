public class Main {
  public static void main(String[] args) {
    Bank b1 = new Bank();
    Bank b2 = new Bank();

    b1.name = "ミナト";
    b1.address = "東京都";
    b2.name = "ミナト";
    b2.address = "東京都";
    System.out.println(b1.equals(b2));

    b2.address = "埼玉県";
    System.out.println(b1.equals(b2));
  }
}
