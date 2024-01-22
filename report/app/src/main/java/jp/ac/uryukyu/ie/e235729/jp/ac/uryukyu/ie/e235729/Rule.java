package jp.ac.uryukyu.ie.e235729;
/**
 * 数当てゲームのルールを管理するクラスです。
 */
class Rule {
    int hit;
    int blow;

    /**
     * ルールを表示するメソッドです。
     * ３つの数字を当てる数当てゲームのルールを表示します。
     */

    public void displayRules() {
        String rules = "３つの数字を当てる数当てゲームです\n" + "数字は1〜9まであり、重複しないものとします（左から順に1,2,3番目とします）\n" + "Hit...数字と位置が当たり\n" + "Blow...数字だけ当たり(位置は違う)\n";
        System.out.println(rules);
    }

    /**
     * プレイヤーが提出した回答が正解かどうかを判定するメソッドです。
     *
     * @param playerNum プレイヤーが提出した回答の数字配列
     * @param answer 正解の数字配列
     * @return 回答が正解ならtrue、それ以外はfalse
     */

    public boolean checkAnswer(int[] playerNum, int[] answer) {
        return playerNum[0] == answer[0] && playerNum[1] == answer[1] && playerNum[2] == answer[2];
    }

    /**
     * プレイヤーが提出した回答に対して、HitとBlowの数を計算するメソッドです。
     *
     * @param playerNum プレイヤーが提出した回答の数字配列
     * @param answer 正解の数字配列
     */
    
    public  void howhitblow(int[] playerNum, int[] answer) {
        hit = 0;
        blow = 0;
        for (int j = 0; j < 3; j++) {
            if (playerNum[j] == answer[j]) {
                hit++;
            } else {
                for (int k = 0; k < 3; k++) {
                    if (playerNum[j] == answer[k]) {
                        blow++;
                    }
                }
            }
        }
    }
}