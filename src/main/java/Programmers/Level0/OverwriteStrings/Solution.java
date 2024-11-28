package Programmers.Level0.OverwriteStrings;

public class Solution {
    // input : He11oWor1d
    // overwriteString : lloWorl
    // index = 2
    // output : HelloWorld
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        String result = useSubstring(my_string, overwrite_string, s);
        System.out.println(result); //pzzzp
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = useReplaceMethod(my_string, overwrite_string, s);
        return answer;
    }

    public static int stringPerambulate(String myString, int s){
        return myString.charAt(s);
    }

    public static int printStringLength(String overwriteString){
        return overwriteString.length();
    }

    public static String printPartString(String myString, String overwriteString, int s){
        return myString.substring(s, printStringLength(overwriteString) + s);
    }

    public static String useReplaceMethod(String myString, String overwriteString, int s){
        return myString.replace(printPartString(myString, overwriteString, s), overwriteString);
    }

    public static String useSubstring(String my_string, String overwrite_string, int s){
        return my_string.substring(0, s) + overwrite_string + my_string.substring(overwrite_string.length()+s);
    }
}
