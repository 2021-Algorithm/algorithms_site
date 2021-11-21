package programmers.level2.study3;

import java.util.Arrays;

public class GetMinSum {

    public static long solution(int[] A, int[] B) {
        long answer = 0;

        A = Arrays.stream(A).sorted().toArray();
        B = Arrays.stream(B).sorted().toArray();


        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[(B.length - 1) - i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        System.out.println(solution(A, B));
    }
}
