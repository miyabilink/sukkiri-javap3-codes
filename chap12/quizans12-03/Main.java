import java.util.*;

public class Main {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(args[0]);
    list.add("world");
    /* 練習12-3の解答ここから */
    if (args[0].equals("hello")) throw new Exception();
    /* 練習12-3の解答ここまで */
    for (Object s : list) System.out.print(s);
  }
}
