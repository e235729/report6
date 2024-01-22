package jp.ac.uryukyu.ie.e235729;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class TestGame{

    @Test
    void testPlayGameWithCorrectAnswer() {
        // テスト対象のクラスを生成
        Game game = new Game();

        // AnswerGeneratorをモック化（固定の答えを返すAnswerGeneratorを使用）
        AnswerGenerator mockAnswerGenerator = new AnswerGenerator() {
            @Override
            public int[] generateAnswer() {
                return new int[]{1, 2, 3}; // テスト用の固定の答え
            }
        };
        game.setAnswerGenerator(mockAnswerGenerator);

        // ユーザー入力のモック化
        String input = "1\n2\n3\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // 標準出力をキャプチャ
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // テスト対象メソッドの実行
        game.playGame();

        // テスト結果の検証
        String expectedOutput = "正解!";
        assertTrue(outContent.toString().contains(expectedOutput));
    }

    @Test
    void testPlayGameWithIncorrectAnswer() {
        // テスト対象のクラスを生成
        Game game = new Game();

        // AnswerGeneratorをモック化（固定の答えを返すAnswerGeneratorを使用）
        AnswerGenerator mockAnswerGenerator = new AnswerGenerator() {
            @Override
            public int[] generateAnswer() {
                return new int[]{1, 2, 3}; // テスト用の固定の答え
            }
        };
        game.setAnswerGenerator(mockAnswerGenerator);

        // ユーザー入力のモック化（不正解の場合）
        String input = "4\n5\n6\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // 標準出力をキャプチャ
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // テスト対象メソッドの実行
        game.playGame();

        // テスト結果の検証
        String expectedOutput = "Hitは0です\nBlowは0です";
        assertTrue(outContent.toString().contains(expectedOutput));
    }
}
