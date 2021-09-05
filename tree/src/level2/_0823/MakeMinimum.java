package level2._0823;

import java.util.Arrays;

public class MakeMinimum {
    public int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        // int[] reverseB = Arrays.stream(B).boxed()
        //     .sorted(Collections.reverseOrder())
        //     .mapToInt(Integer::intValue)
        //     .toArray();


        //Arrays.sort(B, (o1, o2) -> o2 - o1);
        // B = -Arrays.sort(-B);


        // for(int i = 0 ; i < A.length ; i++) {
        //     answer += A[i] * reverseB[i];
        // }

        for(int i = 0 ; i < A.length ; i++) {
            answer += A[i] * B[A.length - 1 - i];
        }

        return answer;
    }
}
