package level1.study6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class HateSameNum {

    public static List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (i == (arr.length - 1)) {
                answer.add(arr[i]);
                break;
            }

            if (arr[i] != arr[i + 1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(solution(arr).toString());
    }
}
