public class AccountTest {
  public static void main(String[] args) {
    testInstantiate();      // （1）インスタンス化テスト
    testTransfer();         // （2）送金テスト
  }
  // 実際にAccountをnewして使ってみるテスト
  private static void testInstantiate() {
    System.out.println("Accountをnewできるかテストします");
    Account a = new Account("ミナト", 30000);
    if (!"ミナト".equals(a.owner)) {
      System.out.println("失敗！　名義人がおかしい");
    }
    if (30000 != a.zandaka) {
      System.out.println("失敗！　残高がおかしい");
    }
    System.out.println("テストを終了します");
  }
  private static void testTransfer() {
    /* : */
  }
}
