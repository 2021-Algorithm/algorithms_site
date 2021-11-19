package programmers.level1.study4;

import java.time.LocalDate;

public class YEAR2016 {
    public static String solution(int a, int b) {
        String[] answer = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 0;
        for (int i = 0; i < a - 1; i++) {
            days += month[i];
        }
        return answer[(days + (b - 1)) % 7];
    }

    public static String solution1(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.println(solution(a, b));
        System.out.println(solution1(a, b));
    }
}
