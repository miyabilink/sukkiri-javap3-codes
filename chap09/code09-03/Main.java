import java.sql.*;

public class Main {
  public static void main(String[] args) {
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

      // STEP 2: 送信処理
      // ********** コード9-3 ここから **********
      // STEP 2-(2)-1 送信すべきSQL文のひな形を準備
      PreparedStatement pstmt = con.prepareStatement
          ("SELECT * FROM MONSTERS WHERE HP >= ?");
      // STEP 2-(2)-2 ひな形に値を流し込みSQL文を組み立てる
      pstmt.setInt(1, 10);             // １番目の？に10を流し込む
      // STEP 2-(2)-3 組み立て終えたSQL文をDBMSに送信する
      ResultSet rs = pstmt.executeQuery();
      // STEP 2-(2)-4 結果表を処理する
       /* *************************************
          結果表の処理（記述する内容は、後述します）
        ************************************* */
      rs.close();
      pstmt.close();                  // 後片付け
      // ********** コード9-3 ここまで **********

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
  }
}
