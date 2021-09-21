import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Account> list = new ArrayList<>();

    /* listの例 */
    Account a1 = new Account("1732050", AccountType.FUTSU);
    Account a2 = new Account("1732051", AccountType.FUTSU);
    a1.zandaka = 500000;
    a2.zandaka = 100000;
    list.add(a1);
    list.add(a2);
    System.out.println("口座番号" + list.get(0).accountNo + "の残高は" + list.get(0).zandaka + "です");
    System.out.println("口座番号" + list.get(1).accountNo + "の残高は" + list.get(1).zandaka + "です");
    System.out.println("listの並びは");
    for (Account a : list) {
      System.out.println(a.accountNo);
    }

    Collections.sort(list, (x,y) -> (x.zandaka - y.zandaka));

    System.out.println("ソート後のlistの並びは");
    for (Account a : list) {
      System.out.println(a.accountNo);
    }
  }
}
