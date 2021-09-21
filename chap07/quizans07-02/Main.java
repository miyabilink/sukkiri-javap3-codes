import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    ResourceBundle rb = ResourceBundle.getBundle("pref");
    System.out.println(rb.getString("aichi.capital") + ":" + rb.getString("aichi.food"));
  }
}
