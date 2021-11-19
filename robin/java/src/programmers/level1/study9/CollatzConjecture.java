package programmers.level1.study9;

public class CollatzConjecture {

    public static int solution(long num) {
        int answer = 0;

        while (true) {
            if (num == 1) break;

            if (answer > 500) {
                answer = -1;
                break;
            }
            if (num % 2 == 0) {
                num = num / 2;
                answer += 1;
            } else {
                num = (num * 3) + 1;
                answer += 1;
            }
        }
        return answer;
    }

    public static int solution2(int num) {
        
        for (int i = 0; i < 500; i++) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            if (num == 1) return i + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(solution(num));
        System.out.println(solution2(num));
    }
}
