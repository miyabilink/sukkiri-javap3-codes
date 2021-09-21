public class Sword implements Cloneable {
  private String name;

  public Sword clone() {
    Sword result = new Sword();
    result.name = this.name;
    return result;
  }

  public Sword() {
    this.name = "";
  }
  public Sword(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
