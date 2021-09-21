import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    List<String> names = List.of("湊雄輔", "朝香あゆみ", "菅原拓真", "大江岳人");
    names.stream()
      .filter(n -> n.length() <= 4)
      .map(n -> n + "さん")
      .forEach(System.out::println);
  }
}
