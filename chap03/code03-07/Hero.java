class Hero implements Cloneable {
  String name;    // 名前
  int hp;         // HP

  public Hero() {
      this.name = "";
  }
  public Hero(String name) {
      this.name = name;
  }
}
