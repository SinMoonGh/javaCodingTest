package Programmers.Level0.parallel;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int solution(int[][] dots) {
        int answer = 0;
        int[][] combination1 = {{0,1}, {0,2}, {0,3}};
        int[][] combination2 = {{2,3}, {1,3}, {1,2}};

        for(int i=0; i < combination1.length; i++){
            float angle1 = angle1(dots, combination1, i);
            float angle2 = angle2(dots, combination2, i);
        }


        return answer;
    }

    public static void main(String[] args) {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int[][] dots2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
//        xyCoordinateFunction(dots);

//        System.out.println(solution(dots2));

        combination(dots);
    }

    // 버젼 2
    public static void combination(int[][] dots){
        int[][] combination1 = {{0,1}, {0,2}, {0,3}};
        int[][] combination2 = {{2,3}, {1,3}, {1,2}};

        for(int i=0; i < combination1.length; i++){
            System.out.println("조합 1 : " + Arrays.toString(combination1[i]));
            System.out.println("조합 2 : " + Arrays.toString(combination2[i]));

            float angle1 = angle1(dots, combination1, i);
            float angle2 = angle2(dots, combination2, i);
            System.out.println("기울기1 : " + angle1 + ", 기울기2 : " + angle2);

            int result = comparisonFunction2(angle1, angle2);
            System.out.println(result);
        }
    }

    public static float angle1(int[][] dots, int[][] combination1, int i){

        int firstIndex = combination1[i][0];
        int secondIndex = combination1[i][1];

        // dots 배열에서 해당 인덱스 값 가져오기
        int x1 = dots[firstIndex][0];
        int y1 = dots[firstIndex][1];

        int x2 = dots[secondIndex][0];
        int y2 = dots[secondIndex][1];

        System.out.println("x1 : " + x1 + ", " + "y1 : " + y1 + ", " + "x2 : " + x2+ ", " + "y2 : " + y2);

        return (float) (y2 - y1) / (x2 - x1);
    }

    public static float angle2(int[][] dots, int[][] combination2, int i){

        int firstIndex = combination2[i][0];
        int secondIndex = combination2[i][1];

        // dots 배열에서 해당 인덱스 값 가져오기
        int x1 = dots[firstIndex][0];
        int y1 = dots[firstIndex][1];

        int x2 = dots[secondIndex][0];
        int y2 = dots[secondIndex][1];

        System.out.println("x1 : " + x1 + ", " + "y1 : " + y1 + ", " + "x2 : " + x2+ ", " + "y2 : " + y2);

        return (float) (y2 - y1) / (x2 - x1);
    }

    public static int comparisonFunction2(float angle1, float angle2){
        if(angle1 == angle2){
            return 1;
        }
        return 0;
    }

    // 버젼 1
    public static void xyCoordinateFunction(int[][] dots){
        for(int i=0; i < dots.length; i++){
            System.out.println("i의 x, y 좌표 : " + Arrays.toString(dots[i]));

            relativeCoordinateFunction(dots, i);
        }
    }

    public static void relativeCoordinateFunction(int[][] dots, int i){
        for(int j = i+1; j < dots.length; j++){
            System.out.println("j의 x, y 좌표 : " + Arrays.toString(dots[j]));

            float angele1 = calculateAngle(dots, i, j);

            System.out.println("a의 기울기 : " + angele1);
        }
    }

//    public static void anotherCalculateAngle(int[][] dots, int i, int j){
//        for()
//    }

    public static float calculateAngle(int[][] dots, int i, int j){
        int yDifference = dots[j][1] - dots[i][1];
        int xDifference = dots[j][0] - dots[i][0];

        return (float) yDifference / xDifference;
    }

    public static int comparisonFunction(int angle1, int angle2){
        if(angle1 == angle2){
            return 1;
        }
        return 0;
    }
}


