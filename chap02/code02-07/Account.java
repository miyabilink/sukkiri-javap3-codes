// 口座クラスです（湊ver.）
// 【利用例】new Account("1732050","普通");
public class Account {
  private String accountNo;
  private int zandaka;
  private String accountType;
  public Account(String aNo, String aType) { 
    this.accountNo = aNo;
    this.accountType = aType;
  }

  public String getAccountNo() {
    return this.accountNo;
  }
  public int getZandaka() {
    return this.zandaka;
  }
  public void setZandaka(int zandaka) {
    this.zandaka = zandaka;
  }
  public String getAccountType() {
    return this.accountType;
  }
}
