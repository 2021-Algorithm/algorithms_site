package lever1_0726;

public class NumberOfDivisorAndSum {

    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left ; i <= right ; i++) {
            for(int j = 1 ; j <= (i / 2) + 1 ; j++) {
                if(i == j * j) {
                    answer = answer - (i * 2);
                }
            }
            answer += i;
        }
        return answer;
    }
}
