import java.util.concurrent.*;

public class PrintingThread extends Thread {
  public void run() {
    for (int i = 9; i >= 0; i--) {
      System.out.print(i + "..");
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) { ; }
    }
  }
}
