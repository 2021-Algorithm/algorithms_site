package level1.study8;

import java.util.Arrays;

public class XN {
    public static long[] solution(int x, int n) {

        long[] answer = new long[Math.abs(n)];

        for (int i = 0; i < Math.abs(n); i++) {

            answer[i] = (long) x + (i * (long) x);

        }
        return answer;
    }

    public static void main(String[] args) {
        int x = -4;
        int n = -2;
        System.out.println(Arrays.toString(solution(x, n)));
    }
}
