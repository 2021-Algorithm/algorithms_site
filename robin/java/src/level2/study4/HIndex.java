package level2.study4;

import java.util.Arrays;

public class HIndex {
    public static int solution(int[] citations) {

        int[] result = Arrays.stream(citations).sorted().toArray();

        int n = result.length;

        for (int i = 0; i < n; i++) {

            if (i + 1 > result[(n - 1) - i]) {
                return i;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }

}
