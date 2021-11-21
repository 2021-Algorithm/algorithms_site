package programmers.level2.study9;


public class 나라의숫자124 {

    public String solution(int n) {
        String[] notation = {"4", "1", "2"};

        if (n < 3) {
            return notation[n];
        }

        String answer = notation[n % 3];

        while (n > 3) {
            n--;
            n = n / 3;
            answer = notation[n % 3] + answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        나라의숫자124 나라의숫자124 = new 나라의숫자124();
        for (int i = 1; i < 20; i++) {
            int n = i;
            System.out.println(i + " = " + 나라의숫자124.solution(n));
        }
    }
}
