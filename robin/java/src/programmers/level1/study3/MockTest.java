package programmers.level1.study3;

import java.util.Arrays;

public class MockTest {
    public static int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int person1Count = 0;
        int person2Count = 0;
        int person3Count = 0;


        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) {
                person1Count++;
            }
            if (answers[i] == person2[i % person2.length]) {
                person2Count++;
            }
            if (answers[i] == person3[i % person3.length]) {
                person3Count++;
            }
        }

        int max = 0;

        max = (person1Count > person2Count) ? person1Count : person2Count;
        max = (max > person3Count) ? max : person3Count;

        int[] answer = new int[3];
        int i = 0;

        if (max == person1Count) {
            answer[i] = 1;
            i++;
        }
        if (max == person2Count) {
            answer[i] = 2;
            i++;
        }
        if (max == person3Count) {
            answer[i] = 3;
            i++;
        }
        int[] newAnswer = Arrays.copyOfRange(answer, 0, i);

        return newAnswer;
    }


    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(answers)));

    }
}
