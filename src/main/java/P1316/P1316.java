package P1316;

import java.util.HashMap;
import java.util.Scanner;

public class P1316 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int answer = N;
        String[] arr = new String[N];
        for(int i = 0 ; i < N; i++){
            arr[i] = sc.next();
//            System.out.println(arr[i]);
        }

        for(int i = 0; i < N; i++){
            HashMap<Character,Boolean> map = new HashMap<Character, Boolean>();

            map.put('a',false);
            map.put('b',false);
            map.put('c',false);
            map.put('d',false);
            map.put('e',false);
            map.put('f',false);
            map.put('g',false);
            map.put('h',false);
            map.put('i',false);
            map.put('j',false);
            map.put('k',false);
            map.put('l',false);
            map.put('m',false);
            map.put('n',false);
            map.put('o',false);
            map.put('p',false);
            map.put('q',false);
            map.put('r',false);
            map.put('s',false);
            map.put('t',false);
            map.put('u',false);
            map.put('v',false);
            map.put('w',false);
            map.put('x',false);
            map.put('y',false);
            map.put('z',false);

            char before = arr[i].charAt(0);
            map.replace(arr[i].charAt(0), false, true);
            boolean is_group = true;
            for(int j = 1; j < arr[i].length(); j++){
                if(!map.get(arr[i].charAt(j))){
                    before = arr[i].charAt(j);
                    map.replace(arr[i].charAt(j), false, true);
                }else{
                    if(before != arr[i].charAt(j)){
                        answer--;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);

    }
}
