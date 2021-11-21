package programmers.level1.study9;

import java.util.stream.LongStream;

public class WeekOne {

    public static long solution(int price, long money, int count) {
        return Math.max(LongStream.range(1, count + 1).map(x -> x * price).sum() - money, 0);
    }

    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(solution(price, money, count));
    }
}
