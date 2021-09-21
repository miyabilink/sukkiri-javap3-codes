import org.apache.logging.log4j.*;

public class Main {
  public static void main(String[] args) {
    Logger logger = LogManager.getLogger(Main.class);
    if (args.length != 2) {
      logger.error("起動引数の数が異常：" + args.length);
    }
  }
}
