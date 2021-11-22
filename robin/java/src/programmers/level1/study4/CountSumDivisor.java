package programmers.level1.study4;

public class CountSumDivisor {
    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i < right + 1; i++) {

            if ((int) Math.sqrt(i) == Math.sqrt(i)) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        System.out.println(solution(left, right));
    }
}
