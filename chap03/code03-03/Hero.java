class Hero {
  String name;    // 名前
  int hp;         // HP

  public Hero() {
      this.name = "";
  }
  public Hero(String name) {
      this.name = name;
  }
  public String getName() {
      return this.name;
  }
  public void setName(String name) {
      this.name = name;
  }
  public int getHp() {
      return this.hp;
  }
  public void setHp(int hp) {
      this.hp = hp;
  }
}
