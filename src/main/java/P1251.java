import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;

public class P1251 {
    //브루트 포스로 다시 풀기
    public static void main(String[] args){
        //처음에 제일 빠른거  그다음에 제일 빠른거 두개만 고르면 됨

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        char first = word.charAt(0);
        int first_idx = 0;
        for(int i = 0; i < word.length()-2; i++){
            if(first > word.charAt(i)){
                first = word.charAt(i);
                first_idx = i;
            }
        }
        System.out.println(first_idx);
        char second = word.charAt(first_idx+1);
        int second_idx = first_idx+1;
        for(int j = first_idx+1;j<word.length(); j++ ){
            if(second > word.charAt(j)){
                second = word.charAt(j);
                second_idx = j;
            }
        }

        StringBuilder answer = new StringBuilder();

        int cnt = 0;

        for(int i = first_idx; i >= 0; i--){
            answer.append(word.charAt(i));
        }
        for(int j = second_idx; j >= first_idx+1; j--){
            answer.append(word.charAt(j));
        }
        for(int j = word.length()-1; j >= second_idx+1; j--){
            answer.append(word.charAt(j));
        }

        System.out.println(answer);


    }
}
