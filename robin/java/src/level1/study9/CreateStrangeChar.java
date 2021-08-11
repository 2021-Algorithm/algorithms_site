package level1.study9;

import java.util.Arrays;

public class CreateStrangeChar {

    public static String solution(String s) {
        String answer = "";

        String[] wordArray = s.split("");
        int idx = 0;

        for (int i = 0; i < wordArray.length; i++) {

            if (wordArray[i].equals(" ")) {
                idx = 0;
            } else if (idx % 2 == 0) {
                wordArray[i] = wordArray[i].toUpperCase();
                idx++;
            } else {
                wordArray[i] = wordArray[i].toLowerCase();
                idx++;
            }

            answer += wordArray[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
}
