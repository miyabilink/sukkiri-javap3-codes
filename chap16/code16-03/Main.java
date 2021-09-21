import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("止めるには「STOP」を入力してください");
    System.out.println("カウントダウンを開始します");
    PrintingThread t = new PrintingThread();
    t.start();
    String input = new Scanner(System.in).nextLine();
    if (input.equals("STOP")) {
      t.stopReq.set(true);
    }
    try {
      t.join();
    } catch (InterruptedException e) { ; }
  }
}
