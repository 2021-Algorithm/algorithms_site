package programmers.level1.study5;

import java.util.Arrays;

public class DescString {

    public static String solution(String s) {
        String answer = "";
        char[] arrayS = s.toCharArray();
        Arrays.sort(arrayS);

        for (int i = arrayS.length - 1; i > -1; i--) {
            answer += arrayS[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
}
