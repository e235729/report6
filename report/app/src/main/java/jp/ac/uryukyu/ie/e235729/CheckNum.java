package jp.ac.uryukyu.ie.e235729;

/**
 * プレイヤーの回答の数字に関する重複チェックを行うクラスです。
 */

public class CheckNum {
    /**
     * プレイヤーの回答に重複があるかどうかを判定するメソッドです。
     *
     * @param array プレイヤーの回答の数字配列
     * @param num チェックする数字
     * @return 重複があればfalse、なければtrue
     */
    
    public static boolean checkNum(int[] array, int num) {
        for (int value : array) {
            if (value == num) {
                return false; // 重複があればfalseを返す
            }
        }
        return true; // 重複がなければTureを返す
    }
}