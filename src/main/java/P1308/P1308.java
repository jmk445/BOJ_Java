package P1308;

import java.util.Scanner;

public class P1308 {
    public static int get_days(int year, int month, int day){
        int[] month_days = {31,28,31,30,31,30,31,30,31,30,31,30};


        int days= 0;

        for(int i = 1; i <= year - 1; i++){
            if(is_yoon(i)){
                month_days[1] = 29;
            }else{
                month_days[0] = 28;
            }
            for(int j = 1; j <= 12; j++){
                days += month_days[j - 1];
            }
        }

//      System.out.println(days);
        if(is_yoon(year)){
            month_days[1] = 29;
        }else{
            month_days[0] = 28;
        }
        for(int i = 1; i <= month - 1; i ++){
            days += month_days[i - 1];
        }

        days += day;

        return days;

    }

    public static boolean is_yoon(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Tyear = sc.nextInt();
        int Tmonth = sc.nextInt();
        int Tday = sc.nextInt();
        int Dyear = sc.nextInt();
        int Dmonth = sc.nextInt();
        int Dday = sc.nextInt();

        if ((Dyear - Tyear > 1000) || (Dyear - Tyear == 1000 && Dmonth > Tmonth)
                || (Dyear - Tyear == 1000 && Dmonth == Tmonth && Dday >= Tday))
            System.out.println("gg");
        else {
            System.out.println("D-" + (get_days(Dyear, Dmonth, Dday) - get_days(Tyear, Tmonth, Tday) ));
        }
    }
}
//
//import java.util.Scanner;
//
//public class P1308.P1308 {
//    public static int get_days(int year, int month, int day) {
//        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        // 1년부터 해당 연도까지의 모든 일수를 계산
//        int days = 0;
//        for (int i = 1; i < year; i++) {
//            if (is_yoon(i)) {
//                days += 366; // 윤년일 경우
//            } else {
//                days += 365; // 평년일 경우
//            }
//        }
//
//        // 해당 연도의 월별 일수 계산
//        if (is_yoon(year)) {
//            month_days[1] = 29; // 윤년인 경우 2월 일수 변경
//        }
//        for (int i = 1; i < month; i++) {
//            days += month_days[i - 1];
//        }
//
//        // 해당 월의 일수를 더함
//        days += day;
//
//        return days;
//    }
//
//    public static boolean is_yoon(int year) {
//        // 윤년 확인
//        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 오늘 날짜 입력
//        int today_year = sc.nextInt();
//        int today_month = sc.nextInt();
//        int today_day = sc.nextInt();
//
//        // 디데이 날짜 입력
//        int dday_year = sc.nextInt();
//        int dday_month = sc.nextInt();
//        int dday_day = sc.nextInt();
//
//        // 오늘 날짜와 디데이 날짜의 총 일수 계산
//        int today_days = get_days(today_year, today_month, today_day);
//        int dday_days = get_days(dday_year, dday_month, dday_day);
//
//        System.out.println(today_days);
//        // 1000년 이상의 차이 판단
//        if (dday_days - today_days >= 365243) { // 365243일은 약 1000년
//            System.out.println("gg");
//        } else {
//            System.out.println("D-" + (dday_days - today_days));
//        }
//    }
//}
