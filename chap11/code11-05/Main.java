public class Main {
  public static void main(String[] args) {
    Account a = new Account("ミナト", 30000);
    Account b = new Account("アサカ", 80000);
    a.transfer(b, 50000);
  }
}
