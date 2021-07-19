package level1_0722;

import java.util.Arrays;

public class Budget {

    public int sol1(int[] d, int budget) {
        int sum = 0;
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
//            System.out.println("sum " + sum);
//            System.out.println("answer " + answer);
            answer++;
            if (sum == budget) break;
            else if (sum > budget) answer--;

        }
        return answer;
    }
}
