package programmers.level1.study5;

import java.util.stream.LongStream;

public class SumBetweenTwoNums {

    public static long solution(int a, int b) {

        return LongStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }


    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        System.out.println(solution(a, b));
    }
}
