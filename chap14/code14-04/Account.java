public class Account {
  private int zandaka;
  public void setZandaka(int zandaka) {
    if (zandaka < 0) {
      throw new IllegalArgumentException("負の残高が設定されそうになりました");
    }
    this.zandaka = zandaka;
  }
}
