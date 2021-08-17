package level1.study9;

import java.util.Arrays;

public class ReverseNum {

    public static int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        return Arrays.asList(String.valueOf(sb.reverse()).split("")).stream().mapToInt(x -> Integer.parseInt(x)).toArray();
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }
}
