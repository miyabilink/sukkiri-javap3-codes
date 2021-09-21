import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
  @Test
  public void testDeniesNegativeZandakaSet() {
    Account a = new Account();
    assertThrows(IllegalArgumentException.class, () -> a.setZandaka(-100));
  }
}
