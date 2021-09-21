public class Hero implements Cloneable {
  String name;    // 名前
  int hp;         // HP
  Sword sword;    // 装備している武器

  public Hero clone() {
    Hero result = new Hero();
    result.name = this.name;
    result.hp = this.hp;
    result.sword = this.sword.clone();
    return result;
  }

  public Hero() {
      this.name = "";
  }
  public Hero(String name) {
      this.name = name;
  }
  public Sword getSword() {
      return this.sword;
  }
  public void setSword(Sword sword) {
      this.sword = sword;
  }
  public String getName() {
      return this.name;
  }
  public void setName(String name) {
      this.name = name;
  }
}
