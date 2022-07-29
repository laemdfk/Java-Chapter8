public class DoWhile01 {
    public static void main(String[] args) {
        int number = 1;
        // do-while文：ループ開始
        do {
            // ブロック：
            // numberにnumber * 2 を代入して、numberを出力
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        // do-while文：
        // numberが50未満の場合、ブロックの処理をループ実行する
        } while (number < 50);
    }
}

// Do-while文の基本構文

// do {
//   ブロック（繰り返し処理）
// } while (条件式);

// まず、ブロックの処理を実行し、処理が完了した後に条件式を評価する。
// →そのため、仮にはじめから条件式の結果が「false」となっていても、while文とは異なり、最低1度はブロックの処理が実行されます。
// 結果が「true」の場合は、再度、最初からブロック内の処理を実行して、結果が「false」になるまでループして実行する。

// ※ while文とdo-while文の違い
// while文とdo-while文の違いは、条件式をブロックの実行前に評価するか、後に評価するか。
// ループ開始時点で、条件が「false」の場合、while文ではブロックが実行されませんが、do-while文ではではブロックが実行される