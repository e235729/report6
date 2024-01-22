package jp.ac.uryukyu.ie.e235729;

public class HitAndBlow {
    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }
}

class Game {
    private Rule rule;
    private AnswerGenerator answerGenerator;
    private PlayerImput playerInput;

    public Game() {
        rule = new Rule();
        answerGenerator = new AnswerGenerator();
        playerInput = new PlayerImput();
    }

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