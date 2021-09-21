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
      // STEP 2-(2)-1 送信すべきSQL文のひな形を準備
      PreparedStatement pstmt = con.prepareStatement
          ("SELECT * FROM MONSTERS WHERE NAME = ?");
      // STEP 2-(2)-2 ひな形に値を流し込みSQL文を組み立てる
      pstmt.setString(1, "ゴブリン");
      // STEP 2-(2)-3 組み立て終えたSQL文をDBMSに送信する
      ResultSet rs = pstmt.executeQuery();
      // STEP 2-(2)-4 結果表を処理する
      // ********** コード9-5 ここから **********
      if (rs.next()) {
        System.out.println("ゴブリンのHPは" + rs.getInt("HP"));
      } else {
        System.out.println("ゴブリンはありませんでした");
      }
      // ********** コード9-5 ここまで **********
      rs.close();
      pstmt.close();                  // 後片付け

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
