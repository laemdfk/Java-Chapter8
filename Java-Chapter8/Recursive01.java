public class Recursive01 {
  public static void main(String[] args) {
    int number = 1;
    printNum(number);
  }

  public static int printNum(int number) {
    if (number < 50) {
      number *= 2;
      System.out.println("While01 = " + number);
      // 条件にマッチしたら自分自身を再度呼び出す
      printNum(number);
    }
    return number;
  }
}

// 再帰処理 = あるメソッドが自分自身を呼び出すことで繰り返しを実現すること
// 再帰処理も条件を適切に設定しないと無限ループに陥り、StackOverflowErrorという実行時例外が発生する恐れがある
// →→ 無限ループになってしまった場合は処理を強制終了させないと終わらない(終われない)。繰り返し処理を行なう場合は、十分に考えてコーディングすること。