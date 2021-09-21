class Hero {
  public String name;
  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Hero)) return false;
    Hero h = (Hero) o;
    if (!this.name.trim().equals(h.name.trim())) {
      return false;
    }
    return true;
  }
}
