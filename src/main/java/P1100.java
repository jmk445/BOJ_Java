//import java.util.Scanner;
//
//public class P1100 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        String[] board = new String[8];
//        for(int i = 0; i < 8; i++){
//            String line = sc.nextLine();
//            board[i] = line;
//        }
//
//        //0 2 4 6 1 3 5 7
//
//        int answer = 0;
//        for(int i = 0; i < 8; i++){
//            for(int j = i % 2; j < 8; j+=2){
//                if(board[i].charAt(j) == 'F'){
//                    answer++;
//                }
//            }
//        }
//
//        System.out.println(answer);
//
//
//    }
//}

import java.util.Scanner;
import java.util.stream.IntStream;

public class P1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] board = new String[8];
        for (int i = 0; i < 8; i++) {
            board[i] = sc.nextLine();
        }

        // Stream을 사용한 로직
        int answer = IntStream.range(0, 8) // 0부터 7까지의 행 인덱스 생성
                .map(i -> (int) IntStream.range(0, 8) // 0부터 7까지의 열 인덱스 생성
                        .filter(j -> j % 2 == i % 2) // 해당 행에 맞는 짝수/홀수 열 필터링
                        .filter(j -> board[i].charAt(j) == 'F') // 해당 위치가 'F'인지 확인
                        .count()) // 개수 세기
                .sum(); // 각 행에서의 개수를 더하기

        System.out.println(answer);
    }
}
