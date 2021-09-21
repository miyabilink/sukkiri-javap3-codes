import java.sql.*;
   /* : */
public class Main {
  public static void main(String[] args) {

    // ********** コード9-6 ここから（1行目のimport文を含む） **********
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
      con.setAutoCommit(false);
      // STEP 2: SQL送信処理
      /* *****メインのDB操作処理***** */
      con.commit();
    } catch (SQLException e) {
      try {
        con.rollback();
      } catch (SQLException e2) {
        e2.printStackTrace();
      }
    } finally {
      // STEP 3: データベース接続の切断
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e3) {
          e3.printStackTrace();
        }
      }
    }
    // ********** コード9-6 ここまで **********

  }
}
