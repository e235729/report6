package jp.ac.uryukyu.ie.e235729;
import java.util.Random;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int num1,num2,num3;
        int hit,blow;
        int count;
        int[] player_num;
        
        //ルールの説明文の用意
        String rules = "３つの数字を当てる数当てゲームです\n" + "数字は０〜９まであり、重複しないものとします（左から順に1,2,3番目とします）\n" + "Hit...数字と位置が当たり\n" + "Blow...数字だけ当たり(位置は違う)\n" ;
        
        //ルールの出力
        System.out.println(rules);

        //答えの用意
        Random rnd = new Random();
        num1 = rnd.nextInt(10);
        while (true) {
            num2 = rnd.nextInt(10);
            if (num2!=num1) {
                break;
            }
        }
        while (true) {
            num3=rnd.nextInt(10);
            if (num3!=num1 && num3!=num2) {
                break;
            }
        }


        //数字を予想する
        count = 1;
        player_num = new int[3];
        for(int i = 0; i < 3;i++ ){
            //playerの入力を受け付ける
            System.out.println( count +"番目の数字を入力してください");
            Scanner scanner = new Scanner(System.in);
            player_num[i] = scanner.nextInt();
            count++;
        }
        System.out.println(player_num[0]);
    }
}
