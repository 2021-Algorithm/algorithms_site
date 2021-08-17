package level1.study9;

import java.util.Arrays;

public class TheSmallestNum {

    public static int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(-1);
        int[] answer = Arrays.stream(arr).filter(x -> x != min).toArray();

        if (answer.length == 0) {
            return new int[]{-1};
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
