package P1094;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class P1094 {
    public static int getSum(Stack<Integer> arr){
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        Stack<Integer> st = new Stack();
        st.push(64);

        while(getSum(st) != X){
            //가장 작은것을 찾아서
            //그것을 절반으로 자른 후에
            //절반으로 자른 것과 나머지들을 다 더해서 X보다 크면
                //자른 거 버림
            //절반으로 자른 것과 나머지들을 다 더해서 X보다 작으면
                //자른거 그대로 둠

            //64
            //32
            //16 16
            //16 8 8
            //16 8
            //16 4 4
            //16 4 2 2
            //16 4 2 1
            int min = st.pop();
            int half = min/2;
            st.push(half);
            if(getSum(st) < X){
                st.push(half);
            }
        }
        System.out.println(st.size());
    }
}
