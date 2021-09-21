public class OthelloGame {
  public static void main(String[] args) {
    System.out.println("オセロゲームを開始します");
    int[][] board = new int[8][8];

    OthelloAI ai = null;
    System.out.println("コンピュータの強さを選んでください" + "(1=弱い, 2=強い, 3=その他)");
    int cpuno = new java.util.Scanner(System.in).nextInt();
    if (cpuno == 1) {
      ai = new WeakOthelloAI();
    } else if (cpuno == 2) {
      ai = new StrongOthelloAI();
    } else {
      /* ： */
    }

    while (true) {
      System.out.println("あなたの番:打つ場所を決めてください");
      /* ： */
      System.out.println("わたしの番：打つ場所を決めます");
      int[] nextStone = ai.decide(board);
      /* ： */
    }
  }
}
