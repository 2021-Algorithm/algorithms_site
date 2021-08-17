package level1.study9;

import java.util.stream.IntStream;

public class SumDivisor {
    public static int solution(int n) {
        return IntStream.range(1, (n / 2) + 1).filter(x -> n % x == 0).sum() + n;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
    }
}
