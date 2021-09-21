public class Account { private int zandaka;
  public void setZandaka(int x) {
    if (x < 0) throw new IllegalArgumentException();
    zandaka = x;
  }
}
