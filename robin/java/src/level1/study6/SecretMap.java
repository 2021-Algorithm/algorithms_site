package level1.study6;

import java.util.Arrays;

public class SecretMap {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {

            String bit = Integer.toBinaryString(arr1[i] | arr2[i]);
            bit = String.format("%" + n + "s", bit);
            bit = bit.replaceAll("1", "#");
            bit = bit.replaceAll("0", " ");
            answer[i] = bit;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};

        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }
}
