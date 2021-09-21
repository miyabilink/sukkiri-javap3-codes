import java.util.concurrent.atomic.*;

public class AnotherCounter {
  private AtomicLong count = new AtomicLong(0);
  public void add(long i) {
    System.out.println("足し算します");
      this.count.getAndUpdate(c -> c + i);
  }
  public void mul(long i) {
    System.out.println("掛け算します");
      this.count.getAndUpdate(c -> c * i);
  }
}
