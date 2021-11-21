package programmers.level1.study3;

import java.util.Arrays;

public class Budget {

    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int dOne : d) {
            if (dOne <= budget) {
                answer += 1;
                budget -= dOne;
            } else {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(solution(d, budget));
    }
}
