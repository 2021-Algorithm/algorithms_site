package programmers.level1.study8;

import java.util.Arrays;

public class NumberOfHashad {

    public static boolean solution(int x) {

        String[] intArray = String.valueOf(x).split("");

        return x % Arrays.stream(intArray).mapToInt(Integer::parseInt).sum() == 0;


    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(solution(x));
    }

}
