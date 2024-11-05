package SsapyCodingTest.Level1.BigOneSmallOneSameOne;

import java.util.Scanner;

public class Solution {
    /*
    2개의 수를 입력 받아 크기를 비교하여 등호 또는 부등호를 출력하는 프로그램을 작성하라.

    [제약 사항]

    각 수는 0 이상 10000 이하의 정수이다.


    [입력]

    가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

    각 테스트 케이스의 첫 번째 줄에는 2개의 수가 주어진다.


    [출력]

    출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

    (t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
    * */

    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {

            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(num1 > num2){
                System.out.println("#" + test_case + " " + ">");
            }
            if(num1 < num2){
                System.out.println("#" + test_case + " " + "<");
            }
            if(num1 == num2){
                System.out.println("#" + test_case + " " + "=");
            }
            /////////////////////////////////////////////////////////////////////////////////////////////

        }
    }
}
