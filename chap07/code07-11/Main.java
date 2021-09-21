import com.fasterxml.jackson.databind.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonFileData file = mapper.readValue (new File("hero.json"), JsonFileData.class);
    System.out.println("名前:" + file.hero.name);
    System.out.println("武器:" + file.hero.weapon.name);
  }
}