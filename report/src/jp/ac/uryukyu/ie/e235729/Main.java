package jp.ac.uryukyu.ie.e235729;
import java.util.Random;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int num1,num2,num3;
        int hit,blow;
        int count;
        int[] player_num;
        CheckNum checkNum = new CheckNum();
        
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
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        //数字を予想する
        count = 1;
        player_num = new int[3];
        while (true) {
            
            for(int i = 0; i < 3;i++ ){
                //playerの入力を受け付ける
                System.out.println( count +"番目の数字を入力してください");
                Scanner scanner = new Scanner(System.in);
                int inputNum = scanner.nextInt();

                //桁をチェック
                if(inputNum >9){
                    System.out.println("9以下の数字を入力してください");
                    // 重複をチェック
                    i--;
                }else{
                    if (!checkNum.checkNum(player_num, inputNum)) {
                        player_num[i] = inputNum;
                        count++;
                    } else {
                        System.out.println("重複した数字です。もう一度入力してください。");
                        i--; // 重複した場合、同じインデックスで入力を受け付けるようにする。
                    }
                }
            }
            if(player_num[0]==num1 && player_num[1]==num2 && player_num[2]==num3){
                break;
            }

        }
    }
}