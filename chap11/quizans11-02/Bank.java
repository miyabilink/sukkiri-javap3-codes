public class Bank {
  private String name;    // 銀行名（必ず３文字以上が設定される）
  public String getName() {
    return this.name;
  }
  public void setName(String newName) {
    /* 練習11-2の解答ここから */
    if (newName.length() < 3) {
    /* 練習11-2の解答ここまで */
      throw new IllegalArgumentException("名前が不正です");
    }
    this.name = newName;
  }
}
