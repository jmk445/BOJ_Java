package P1343;

import java.util.ArrayList;
import java.util.Scanner;

public class P1343 {
    public static void main(String[] args){
        //사전 순으로 가장 앞서는 것
            //다 구해서 제일 앞서는 거 고르기?
            //처음 부터 앞서는 거 고르기

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'X'){
                sb.append('X');
            }else{
                String chunk = sb.toString();
                arr.add(chunk);
                sb.setLength(0);
            }
            if(i == input.length() -1 ){
                String chunk = sb.toString();
                arr.add(chunk);
                sb.setLength(0);
            }
        }

        StringBuilder sb1 = new StringBuilder();

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).length() % 2 == 1){
                System.out.println("-1");
                return;
            }
//            System.out.println(arr.get(i).length());
            int cnt_AAAA = (arr.get(i).length() / 4);
            int cnt_BB = (arr.get(i).length() % 4)/2;
//            System.out.println(cnt_AAAA);
//            System.out.println(cnt_BB);

            for(int j = 0; j < cnt_AAAA ; j ++){
                sb1.append("AAAA");
            }

            for(int j = 0; j < cnt_BB ; j ++){
                sb1.append("BB");
            }

            if(arr.size() != 1 && i != arr.size() -1){
                sb1.append(".");
            }

        }

        System.out.println(sb1.toString());
    }
}
