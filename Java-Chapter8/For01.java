public class For01 {
    public static void main(String[] args) {
        // for文：
        // 初期化式：numberを1で初期化
        // 条件式：numberが5未満の場合、ブロックの処理を行う
        // 変化式：ブロックの処理後に、numberをインクリメントする
        // インクリメント→→対象の値を1つ増やす演算子(6章「演算子を学ぼう」参照)
        
        for (int number = 1; number <= 5; number++) {
            // ブロック：numberを出力
            System.out.println("For01 = " + number);
        }
    }
}

// for文の基本構文
// for (初期化式; 条件式; 変化式) {
//     ブロック(繰り返し処理)
// }

// 最初に初期化式で、変数の初期化を行う。
// 次に条件式の評価を行い「true」ならブロックの処理を実行。
// ブロック処理後に変化式の処理を行い、条件式の評価をする。条件式が「false」になるまで、ブロック内の処理をループして実行する。
