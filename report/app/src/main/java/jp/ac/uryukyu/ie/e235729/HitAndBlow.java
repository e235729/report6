package jp.ac.uryukyu.ie.e235729;

/**
 * 数当てゲームのメインクラスです。
 */

public class HitAndBlow {
        /**
     * 数当てゲームを開始するメソッドです。
     */
    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }
}
/**
 * 数当てゲームを管理するクラスです。
 */
class Game {
    private Rule rule;
    private AnswerGenerator answerGenerator;
    private PlayerImput playerInput;
    /**
     * ゲームのコンストラクタです。ルール、回答生成器、プレイヤー入力を初期化します。
     */

    public Game() {
        rule = new Rule();
        answerGenerator = new AnswerGenerator();
        playerInput = new PlayerImput();
    }
    /**
     * ゲームをプレイするメソッドです。
     */

    public void playGame() {
        rule.displayRules();

        int[] answer = answerGenerator.generateAnswer();

        int count = 1;
        int[] playerNum;

        while (true) {
            playerNum = playerInput.getPlayerInput(count);
            rule.howhitblow(playerNum, answer);

            if (rule.checkAnswer(playerNum, answer)) {
                System.out.println("正解!");
                break;
            }else{
                System.out.println("Hitは"+ rule.hit +"です\n" + "Blowは" + rule.blow + "です");
            }
        }
    }
}