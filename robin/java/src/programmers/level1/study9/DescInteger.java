package programmers.level1.study9;

import java.util.Arrays;

public class DescInteger {

    public static long solution(long n) {
        char[] chr = String.valueOf(n).toCharArray();
        Arrays.sort(chr);

        StringBuilder sb = new StringBuilder(String.valueOf(chr));

        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        int n = 118372;
        System.out.println(solution(n));
    }
}
