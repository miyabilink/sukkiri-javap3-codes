public class Main {
  public static void main(String[] args) {
    Pocket p = new Pocket();
    p.put("1192");
    String s = (String)p.get();
    System.out.println(s);
  }
}
