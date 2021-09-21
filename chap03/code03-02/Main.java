import java.util.function.*;

public class Main {
  public static Integer len(String s) {
    return s.length();
  }
  public static void main(String[] args) {
    // lenメソッドの処理ロジックを、変数funcに代入する
    Function<String, Integer> func = Main::len;
    // 変数funcに格納されている処理ロジックを、引数"Java"で実行する
    int a = func.apply("Java");
    System.out.println("文字列「Java」は" + a + "文字です");
  }
}
