package jp.ac.uryukyu.ie.e235729;

import java.util.Random;
//答えを作成する関数の用意
public class Answer {
    private int[] answer;
    public Answer(){
        answer = new int[3];
        Random rnd = new Random();
        for(int i = 0; i < 3; i++) {
            boolean much = true;
            answer[i] = rnd.nextInt(10);
            do{
                much =true;
                for(int k = i - 1; k >= 0; k--){
                    if(answer[i] == answer[k]){
                        much = false;
                        answer[i] = rnd.nextInt(10);
                    }
                }
            }while(much == false);
        }
    }

    public int[] getAnswer() {
        return answer;
    }
}

