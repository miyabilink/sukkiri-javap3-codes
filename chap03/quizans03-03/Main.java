import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    IntPredicate f1 = x -> x % 2 == 1;
    Func2 f2 = (point, name) -> {
      return name + "さんは" + ( point > 65 ? "合格" : "不合格" );
    };
    System.out.println(f1.test(15));
    System.out.println(f2.call(66, "Smith"));
  }
}
