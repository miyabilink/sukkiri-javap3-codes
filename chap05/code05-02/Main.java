public class Main {
  public static void main(String[] args) {
    Bank b1 = new Bank();
    Bank b2 = new Bank();

    b1.name = "ミナト";
    b1.adress = "東京都";
    b2.name = "ミナト";
    b2.adress = "東京都";
    System.out.println(b1.equals(b2));

    b2.adress = "埼玉県";
    System.out.println(b1.equals(b2));
  }
}
