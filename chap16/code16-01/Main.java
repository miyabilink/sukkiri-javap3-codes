import java.util.*;
import java.util.concurrent.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("止めるには「STOP」を入力してください");
    System.out.println("カウントダウンを開始します");
    for (int i = 9; i >= 0; i--) {
      System.out.print(i + "..");
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {;}
    }
    String input = new Scanner(System.in).nextLine();
    System.out.println("入力文字列：" + input);
  }
}
