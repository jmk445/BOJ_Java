package P1384;

import java.util.ArrayList;
import java.util.Scanner;

public class P1384 {
    public static String extract_name(String input){
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < input.length();j ++){
            if(input.charAt(j) == 'P' || input.charAt(j) == 'N'){
                break;
            }
            sb.append(input.charAt(j));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = -1;
        int groupNo = 1;
        do{
            N = sc.nextInt();
            System.out.println(N);

            sc.nextLine();
            String[] arr = new String[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextLine();
            }
            System.out.println("Group" + groupNo);
            for(int i = 0; i < arr.length; i++){
                String name = extract_name(arr[i]);
//                System.out.println(name);
                int offset = 0;
                ArrayList<Integer> offset_arr = new ArrayList();
                for(int j = arr[i].length()-1; j >= 1; j-- ){
                    offset++;
                    if(arr[i].charAt(j) == 'N'){
                        offset_arr.add(offset);
                        System.out.println(offset);
                    }
                }

                if(offset_arr.size() != 0){
                    for(int j = 0; j < offset_arr.size(); i++){
                        String nasty = "";
                        if(offset_arr.get(j) + i + 1 > arr.length){

                        }else{
                            nasty = extract_name(arr[i+offset_arr.get(j)]);
                        }
                        System.out.println(nasty + "was nasty about" + name);
                    }
                }else{
                    System.out.println("nobody was nasty");
                }
            }
            groupNo += 1;
        }while(N!= 0);
    }

}
