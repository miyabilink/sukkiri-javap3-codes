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
      // ********** コード9-2 ここから **********
      // STEP 2-(1)-1 送信すべきSQL文のひな形を準備
      PreparedStatement pstmt = con.prepareStatement
          ("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");
      // STEP 2-(1)-2 ひな形に値を流し込みSQL文を組み立てる
      pstmt.setInt(1, 10);            // １番目の？に10を流し込む
      pstmt.setString(2, "ゾンビ");    // ２番目の？にゾンビを流し込む
      // STEP 2-(1)-3 組み立て終えたSQL文をDBMSに送信する
      int r = pstmt.executeUpdate();
      // STEP 2-(1)-4 処理結果を判定する
      if (r != 0) {
        System.out.println(r + "件のモンスターを削除しました");
      } else {
        System.out.println("該当するモンスターはありませんでした");
      }
      pstmt.close();                  // 後片付け
      // ********** コード9-2 ここまで **********

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
