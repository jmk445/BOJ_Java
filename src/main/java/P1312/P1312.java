package P1312;

import java.util.Scanner;

public class P1312 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int tmp1 = (A%B) * 10;
        int tmp2 = tmp1 / B;
        if(N == 1){
            System.out.println(tmp2);
        }else{
            for(int i = 0; i < N-1; i++){
                tmp1 = (tmp1 % B) * 10;
                tmp2 = tmp1 / B;

            }
            System.out.println(tmp2);
        }
    }
}
