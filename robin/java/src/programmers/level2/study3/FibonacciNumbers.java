package programmers.level2.study3;

public class FibonacciNumbers {

    public static long solution(int n) {
        long a = 0;
        long b = 1;

        for (int i = 0; i < n; i++) {

            long temp = 0;
            temp = a;

            a = b;
            b = temp + b;

            if (a >= 2) {
                a %= 1234567;
            }
        }
        return a;
    }

    public static long solution2(int n) {
        long a = 0;
        long b = 1;

        for (int i = 0; i < n; i++) {

            long sum = a + b;
            sum %= 1234567;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
        System.out.println(solution2(n));
    }

}
