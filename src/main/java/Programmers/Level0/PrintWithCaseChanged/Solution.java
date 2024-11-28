package Programmers.Level0.PrintWithCaseChanged;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class Solution {
    // input : aBcDeFg
    // output : AbCdEfG

    // A : 65, a : 97
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String[] letters = a.split("");
        StringBuilder answer= new StringBuilder();

        for (String letter : letters) {
            int asciiValue = letter.charAt(0);

            if (asciiValue >= 65 && asciiValue <= 96){
                answer.append(letter.toLowerCase());
            }

            if(asciiValue >= 97 && asciiValue <= 122){
                answer.append(letter.toUpperCase());
            }
        }
        System.out.println(answer);
    }

    public static void splitWord(String input){
        String[] letters = input.split("");
        String answer="";

        for (String letter : letters) {
//            System.out.println(letter);
            answer = checkUppercaseAndLowercase(letter, answer);
        }
        System.out.println(answer);
    }

    public static void checkMethod(String a){
        for (char word : a.toCharArray()){
            System.out.println((int) word);
        }
    }

    public static String checkUppercaseAndLowercase(String letter, String answer){
        int asciiValue = letter.charAt(0);

        if (asciiValue >= 65 && asciiValue <= 96){
            answer += letter.toLowerCase();
        }

        if(asciiValue >= 97 && asciiValue <= 122){
            answer += letter.toUpperCase();
        }

        return answer;
    }
}
