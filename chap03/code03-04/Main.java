import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    Function<String, Integer> func = (String s) -> { return s.length(); };
    int n = func.apply("Java");
    System.out.println("文字列「Java」は" + n + "文字です");
  }
}
