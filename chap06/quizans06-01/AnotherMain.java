import java.nio.file.*;

public class AnotherMain {
  public static void main(String[] args) throws Exception {
    Files.copy(Paths.get(args[0]), Paths.get(args[1]));
  }
}
