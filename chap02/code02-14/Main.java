import java.util.*;

public class Main {
  // 文字列sを文字cで挟んで装飾するメソッド
  // ・文字列sがnullまたは長さ0の場合は、nullを返す。
  // ・戻り値は「nullの可能性がある」ことを明示するために、
  //  単なるStringではなくOptional<String>とする。
  public static Optional<String> decorate(String s, char c) {
    String r;
    if (s == null || s.length() == 0) {
      r = null;
    } else {
      r = c + s + c;
    }
    return Optional.ofNullable(r);
  }

  public static void main(String[] args) {
    Optional<String> s = decorate("", '*');
    System.out.println(s.orElse("nullのため処理できません"));
  }
}
