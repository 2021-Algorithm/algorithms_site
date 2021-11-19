package programmers.level1.study6;

import java.util.Arrays;

public class RemainZero {
    public static int[] solution(int[] arr, int divisor) {
        int [] answer = Arrays.stream(Arrays.stream(arr).filter(x -> x % divisor == 0).toArray()).sorted().toArray();

        if (answer.length == 0) return new int[] {-1};

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(solution(arr, divisor)));
    }
}
