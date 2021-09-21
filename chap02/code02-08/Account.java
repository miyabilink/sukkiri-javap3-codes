// 口座クラスです（朝香ver.）
// 【利用例】new Account("1732050", Account.FUTSU);
public class Account {
  private String accountNo;
  private int zandaka;
  private int accountType;
  public Account(String aNo, int aType) {
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
    String tmpAccountType = "";
    if (this.accountType == 1) {
      tmpAccountType = "普通";
    } else if (this.accountType == 2) {
      tmpAccountType = "当座";
    } else if (this.accountType == 3) {
      tmpAccountType = "定期";
    }
    return tmpAccountType;
  }

  public static final int FUTSU = 1;
  public static final int TOUZA = 2;
  public static final int TEIKI = 3;
}
