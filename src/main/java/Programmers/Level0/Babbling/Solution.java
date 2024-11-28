package Programmers.Level0.Babbling;

public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] array = {"aya", "ye", "woo", "ma"};
        String memory = "";

        for(String babblingStr : babbling){
            memory = "";
            for(String arrayStr : array){
                if(babblingStr.length() >= arrayStr.length()){
                    if (babblingStr.contains(arrayStr)){
                        memory += arrayStr;
                    }
                }
            }
            if (babblingStr.equals(memory)){
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
//
//        System.out.println(solution.solution(babbling));

        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(solution.solution(babbling2));

    }
}
