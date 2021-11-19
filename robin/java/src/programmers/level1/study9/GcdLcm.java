package programmers.level1.study9;

import java.util.Arrays;

public class GcdLcm {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);

        return answer;
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        System.out.println(Arrays.toString(solution(n, m)));
    }
}
