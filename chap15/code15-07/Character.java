public abstract class Character {
  protected String name;
  /* : */
  public final void introduce() {
    System.out.println("私の名前は、" + this.name + "です。");
    doIntroduce();
    System.out.println("よろしくお願いします。");
  }
  protected abstract void doIntroduce();  
}