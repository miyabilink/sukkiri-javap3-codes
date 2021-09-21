public class Main {
  public static void main(String[] args) {
    Account a1 = new Account("1732050", "普通");
    System.out.println("口座番号は" + a1.getAccountNo() + "です");
    System.out.println("口座種別は" + a1.getAccountType() + "です");
  }
}
