import java.sql.*;

public class Main {
  public static void main(String[] args) {

    // ********** コード9-1 ここから（1行目のimport文を含む） **********
    // STEP 0: 事前準備（JAR配置を含む）
    try {
      Class.forName("org.h2.Driver");
    } catch (ClassNotFoundException e) {
      throw new IllegalStateException("ドライバのロードに失敗しました");
    }
    /* : */
    Connection con = null;
    try {
      // STEP 1: データベースの接続
      con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
      // STEP 2: SQL送信処理
      /* ******************************
          メインのDB操作処理（後述します）
       ****************************** */
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      // STEP 3: データベース接続の切断
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    // ********** コード9-1 ここまで **********

  }
}
