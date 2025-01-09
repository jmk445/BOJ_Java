package P1340;

import java.util.Scanner;

public class P1340 {
    public static boolean is_yoon(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static double cal_percentage(String[] dates){
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        int month = 1;
        for(int i = 0; i < 12; i ++){
            if(dates[0].equals(months[i])){
                month = i + 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(dates[1].charAt(0));
        sb.append(dates[1].charAt(1));

        String day = sb.toString();
        String[] time = dates[3].split(":");

        int int_day = Integer.valueOf(day);
        int year = Integer.valueOf(dates[2]);
        int hour = Integer.valueOf(time[0]);
        int min = Integer.valueOf(time[1]);


        if(is_yoon(year)){
            days[1] = 29;
        }

        int day_before_today = 0;

        //오류
//        for(int i = 1; i < month; i ++){
//            day_before_today += days[i];
//        }
        //내코드가 5월의 경우, 2월 3월 4월 5월 이렇게 구해지고 결국엔 일 수는 28 + 31+30+31로 1,2,3,4월 더 한 것과 같았기 때문에 5월 의 경우 오류가 없었음
        //하지만 만약에, 2월이라면? 내 코드는 2월만 더해질거고 원래 코드는 1월 2월이 더해질 거다.
        //수정
        for(int i = 0; i < month - 1; i ++){
            day_before_today += days[i];
        }

        day_before_today += int_day -1;
        int time_before_today = day_before_today * 24;

        int times_passed = time_before_today + hour;

        int mins_passed = times_passed * 60 + min;

        int mins_1year = 0;
        for(int i = 0;i < 12;i++){
            mins_1year += days[i]*24*60;
        }

        double percentage = (double)mins_passed * 100/ mins_1year ;

        return percentage;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parseInput = input.split(" ");

        double percentage = cal_percentage(parseInput);
        System.out.println(percentage);
    }
}
