public class Account {
  String owner;
  public Account(String owner, int zandaka) {
    this.owner = owner;
    this.zandaka = zandaka;
  }
  /* コード11-5ここから */
  int zandaka;
  public void transfer(Account dest, int amount) {
    dest.zandaka += amount;
    zandaka -= amount;
    assert this.zandaka >= 0;
  }
}
/* コード11-5ここまで */
