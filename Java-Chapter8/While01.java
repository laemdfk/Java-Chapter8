public class While01 {
  public static void main(String[] args) {
      int number = 1;
      // while文：ループ開始
      // numberが50未満の場合、ブロックの処理を行なう
      while (number < 50) {
          // ブロック：
          // numberにnumber * 2 を代入して、numberを出力
          number *= 2;
          System.out.println("While01 = " + number);
      }
  }
}

// while文の基本構文
// while (条件式) {
//   ブロック（繰り返し処理）
// }

// 条件式を評価して結果が「true」の場合は、ブロック内の処理を実行する。
// ブロック内の処理が完了した後に、再度、条件式を評価して結果が「false」になるまで、ブロック内の処理をループ実行する。

// ※ while文とdo-while文の違い
// while文とdo-while文の違いは、条件式をブロックの実行前に評価するか、後に評価するか。
// ループ開始時点で、条件が「false」の場合、while文ではブロックが実行されませんが、do-while文ではではブロックが実行される