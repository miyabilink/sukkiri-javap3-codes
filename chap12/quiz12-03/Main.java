import java.util.*;

public class Main {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(args[0]);
    list.add("world");
    if (args[0] == "hello") new Exception();
    for (Object s : list) System.out.print(s);
  }
}
