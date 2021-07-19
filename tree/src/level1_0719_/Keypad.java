package level1_0719_;

//맨하탄 거리 문제!
public class Keypad {

    public String solution(int[] numbers, String hand) {
        String answer = "";
        int tempL = 10, tempR = 12, lengthL = 0, lengthR = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 1) {
                answer = answer + "L";
                tempL = numbers[i];
            } else if (numbers[i] % 3 == 0 && numbers[i] != 0) {
                answer = answer + "R";
                tempR = numbers[i];
            } else {
                if (numbers[i] == 0) numbers[i] = 11;
                lengthL = Math.abs(tempL - numbers[i]);//왼손거리
                lengthR = Math.abs(tempR - numbers[i]); //오른손거리
                if (lengthL >= 3) lengthL = (lengthL % 3) + (lengthL / 3);
                if (lengthR >= 3) lengthR = (lengthR % 3) + (lengthR / 3);
                if (lengthL < lengthR) {
                    answer = answer + "L";
                    tempL = numbers[i];
                } else if (lengthR < lengthL) {
                    answer = answer + "R";
                    tempR = numbers[i];
                } else {
                    if (hand.equals("right")) {
                        answer = answer + "R";
                        tempR = numbers[i];
                    } else {
                        answer = answer + "L";
                        tempL = numbers[i];
                    }
                }
            }
        }

        return answer;
    }


}
