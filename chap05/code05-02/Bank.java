public class Bank {
  String name;
  String adress;

  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Bank)) return false;
    Bank r = (Bank)o;
    if (!this.name.equals(r.name)) return false;
    if (!this.adress.equals(r.adress)) return false;
    return true;
  }
}
