public class Outer {
  int outerMember = 2;    //非finalメンバ（ただし再代入がなく実質的にfinal）
  void outerMethod() {
    int a = 10;           //非finalローカル変数
    class Inner {
      public void innerMethod() {
        System.out.println("innerMethodです");
        System.out.println(outerMember + a);
      }
    }
    Inner ic = new Inner();
    ic.innerMethod();
  }
}
