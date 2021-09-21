import org.apache.commons.lang3.builder.*;

public class Bank {
  String name;
  String address;

  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }
}
