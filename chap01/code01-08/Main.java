import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Account> list = new ArrayList<>();
    Account a1 = new Account();
    Account a2 = new Account();
    a1.number = 200;
    a2.number = 100;
    list.add(a1);
    list.add(a2);

    System.out.println("ソート前：");
    for (Account a :list) {
      System.out.println(a.number);
    }

    Collections.sort(list);

    System.out.println("ソート後：");
    for (Account a :list) {
      System.out.println(a.number);
    }
  }
}
