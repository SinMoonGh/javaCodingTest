package SsapyCodingTest.Level1.YearMonthDayCalendar;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
        int[] endDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int test_case = 1; test_case <= T; test_case++)
        {

            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
            String input = sc.next();
            String month = input.substring(4, 6);
            String day = input.substring(6);

            if (input.length() != 8){
                System.out.printf("#%d -1\n", test_case);
                continue;
            } else if (parseInt(month) > 12) {
                System.out.printf("#%d -1\n", test_case);
                continue;
            } else if (parseInt(day) > endDay[parseInt(month)] || parseInt(day) <= 0) {
                System.out.printf("#%d -1\n", test_case);
                continue;
            }

            StringBuilder stringBuilder = new StringBuilder(input);
            stringBuilder.insert(4, '/');
            stringBuilder.insert(7, '/');

            System.out.printf("#%d %s\n", test_case, stringBuilder);

            /////////////////////////////////////////////////////////////////////////////////////////////

        }

//        String[] list = {"01", "11", "12", "13"};
//        boolean exception = false;
//
//        for(String p : list){
//            int test = parseInt(p);
//            if(test > 12){
//                exception = true;
//            }
//
//            if(exception){
//                System.out.println("-1");
//            }else {
//                System.out.println("테스트 : "+ test);
//            }
//
//        }
//
//        int[] endDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        String[] list = {"28", "33", "25"};
//        int Month = 12;
//
//
//        for(String p : list){
//            boolean exception = false;
//            int test = parseInt(p);
//            if(endDay[Month] < test){
//                exception = true;
//            }
//
//            if(exception){
//                System.out.println("-1");
//            }else {
//                System.out.println("테스트 : "+ test);
//            }
//
//        }

    }
}
