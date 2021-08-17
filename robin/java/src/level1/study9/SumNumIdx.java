package level1.study9;

public class SumNumIdx {


    /* 참고 프로그래머스 댓글
    * 321%10은 123을 10으로 나눈 나머지 3을 반환합니다.
    * 123/10은 123을 10으로 나눈 몫 12를 반환합니다.
    * 따라서 12를 다시 함수에 넣고 돌리겠죠.
    * (return 123%10 + solution(123/10) -> return 3 + solution(12)).
    * 2번째 돌릴땐 return에는 이전에 반환한 3 에다가 + 12%10 + solution(12//10).
    * 즉 2번째에는 return 3+2+solution(1)이 됩니다.
    * 3번째에는 if문에서 1이 10보다 작으므로 return 1을 해주고
    * 최종적으로 return 3+2+1이 됩니다.
    * */

    public static int solution(int n) {
        if (n < 10) return n;

        return (n % 10) + solution(n / 10);
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }
}
