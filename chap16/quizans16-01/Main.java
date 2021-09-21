public class Main {
  public static void main(String[] args) throws Exception {
    new CountUpThread().start();
    new CountUpThread().start();
    new CountUpThread().start();
  }
}
