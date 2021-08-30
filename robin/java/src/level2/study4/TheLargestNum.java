package level2.study4;

import java.util.Arrays;
import java.util.Comparator;

public class TheLargestNum {

    public static String solution(int[] numbers) {
        String answer = "";

        String[] strings = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        for (String str : strings) {
            answer += str;
        }

        if (answer.startsWith("0")) {
            return "0";
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0, 0};
        System.out.println(solution(numbers));
    }
}
