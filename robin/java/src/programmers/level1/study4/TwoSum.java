package programmers.level1.study4;

import java.util.*;

public class TwoSum {
    public static List<Integer> solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> ls = new ArrayList<>(set);
        Collections.sort(ls);
        return ls;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(solution(numbers));
    }
}
