package programmers.level1.study6;

import java.util.*;

public class SortString {
    public static String[] solution(String[] strings, int n) {

        List<String> array = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            array.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(array);

        String[] answer = new String[strings.length];

        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i).substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(solution(strings, n)));
    }
}
