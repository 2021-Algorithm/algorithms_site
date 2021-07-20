package level1.study2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PressKeypad {

    public static String solution(int[] numbers, String hand) {
        String answer = "";

        /* 공식 ((|a - b|)/3  + (|a - b|)%3 ))
         * 1     ,2     ,3
         * 4     ,5     ,6
         * 7     ,8     ,9
         * 10(*) ,11(0) ,12(#)
         * */

        int leftIdx = 10;
        int rightIdx = 12;


        for (int number : numbers) {

            if (number == 0) number = 11;

            int leftDistance = Math.abs(leftIdx - number) / 3 + Math.abs(leftIdx - number) % 3;
            int rightDistance = Math.abs(rightIdx - number) / 3 + Math.abs(rightIdx - number) % 3;

            if (number == 1 || number == 4 || number == 7) {
                leftIdx = number;
                answer += "L";
            }

            if (number == 3 || number == 6 || number == 9) {
                rightIdx = number;
                answer += "R";
            }

            if (number == 2 || number == 5 || number == 8 || number == 11) {

                if (leftDistance == rightDistance) {

                    if (hand.equals("left")) {
                        leftIdx = number;
                        answer += "L";
                    }

                    if (hand.equals("right")) {
                        rightIdx = number;
                        answer += "R";
                    }

                } else {

                    if (leftDistance < rightDistance) {
                        leftIdx = number;
                        answer += "L";
                    }

                    if (leftDistance > rightDistance) {
                        rightIdx = number;
                        answer += "R";
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers, hand));
        //LRLLLRLLRRL
    }
}
