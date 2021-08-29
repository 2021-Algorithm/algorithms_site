package level2.study4;

import java.util.Arrays;

public class MaximumAndMinimum {

    public static String solution(String s) {
        String answer = "";

        int[] ints = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        answer += String.valueOf(ints[0]);
        answer += " ";
        answer += String.valueOf(ints[ints.length -1]);

        return answer;
    }

    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }
}
