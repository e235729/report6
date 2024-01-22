package jp.ac.uryukyu.ie.e235729;
import java.util.Random;
/**
 * 正解を生成するクラスです。
 */
class AnswerGenerator {
        /**
     * 1から9までの異なる数字からなる正解を生成します。
     *
     * @return 生成された正解の数字配列
     */
    public int[] generateAnswer() {
        int num1, num2, num3;
        Random rnd = new Random();
        num1 = rnd.nextInt(9)+1;
        while (true) {
            num2 = rnd.nextInt(9)+1;
            if (num2 != num1) {
                break;
            }
        }
        while (true) {
            num3 = rnd.nextInt(9)+1;
            if (num3 != num1 && num3 != num2) {
                break;
            }
        }
        return new int[]{num1, num2, num3};
    }
}