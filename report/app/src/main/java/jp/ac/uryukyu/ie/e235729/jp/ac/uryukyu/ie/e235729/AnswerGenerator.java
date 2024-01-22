package jp.ac.uryukyu.ie.e235729;
import java.util.Random;

class AnswerGenerator {
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