package jp.ac.uryukyu.ie.e235729;

import java.util.Scanner;
/**
 * プレイヤーの入力を管理するクラスです。
 */

class PlayerImput  {
        /**
     * プレイヤーからの入力を受け付けるメソッドです。
     *
     * @param count 入力の回数
     * @return プレイヤーの回答の数字配列
     */
    public int[] getPlayerInput(int count) {
        int[] playerNum = new int[3];
        CheckNum checkNum = new CheckNum();
        for (int i = 0; i < 3; i++) {
            // playerの入力を受け付ける
            System.out.println(count + "番目の数字を入力してください");
            Scanner scanner = new Scanner(System.in);
            int inputNum = scanner.nextInt();

            // 桁をチェック
            if (inputNum > 9) {
                System.out.println("9以下の数字を入力してください");
                i--;
            } else {
                //重複をチェック
                if (checkNum.checkNum(playerNum, inputNum)) {
                    playerNum[i] = inputNum;
                    count++;
                } else {
                    System.out.println("重複した数字です。もう一度入力してください。");
                    i--; // 重複した場合、同じインデックスで入力を受け付けるようにする。
                }
            }
        }
        return playerNum;
    }
}