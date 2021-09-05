package level1.level1_0812;

public class SumOfDivisor {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer = answer + i;
            }
        }

        return answer;
    }
}
