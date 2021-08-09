package level1.study8;

import java.util.Arrays;

public class Average {
    public static double solution(int[] arr) {
        double answer = (double) Arrays.stream(arr).sum() / arr.length;

        /**
         * 또 다른 좋은 답
         double answer2 = Arrays.stream(arr).average().orElse(0);
         System.out.println(answer2);
         **/
        
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(solution(arr));
    }
}
