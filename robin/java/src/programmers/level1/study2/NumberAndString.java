package programmers.level1.study2;

import java.util.HashMap;
import java.util.Map;

public class NumberAndString {

    public static int solution(String s) {

       String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replaceAll(arr[i], Integer.toString(i));
            }
        }
        return Integer.parseInt(s);
    }


/*효율성 검증에서 70점*/
    public static Map<String, String> hashMapInfo() {
        Map<String, String> hm = new HashMap<>();
        hm.put("one", "1");
        hm.put("two", "2");
        hm.put("three", "3");
        hm.put("four", "4");
        hm.put("five", "5");
        hm.put("six", "6");
        hm.put("seven", "7");
        hm.put("eight", "8");
        hm.put("nine", "9");
        return hm;
    }


    public static int solution_70(String s) {
        Map<String, String> hm = hashMapInfo();

        for (Map.Entry<String, String> entry : hm.entrySet()) {

            if (s.contains(entry.getKey())) {
                s = s.replace(entry.getKey(), entry.getValue());

            }
        }
        return Integer.parseInt(s);
    }
/**/


    public static void main(String[] args) {
        String s = "23four567";
        System.out.println(solution(s));

    }
}
