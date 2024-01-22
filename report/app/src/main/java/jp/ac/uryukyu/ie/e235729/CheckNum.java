package jp.ac.uryukyu.ie.e235729;

public class CheckNum {
    public static boolean checkNum(int[] array, int num) {
        for (int value : array) {
            if (value == num) {
                return false; // 重複があればtrueを返す
            }
        }
        return true; // 重複がなければfalseを返す
    }
}