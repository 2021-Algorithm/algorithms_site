package level1_0812;

public class CollatzConjecture {
    public int solution(int num) {
        long i = num;
        int answer = 0;
        while(i != 1) {
            if(i % 2 == 0) {
                i = i / 2;
                answer++;
                System.out.println("num : " + i + ", " + "answer : " + answer);
            }
            else {
                i = (i * 3) + 1;
                answer++;
                System.out.println("num : " + num + ", " + "answer : " + answer);
            }
            if(answer > 500) {
                return -1;
            }
        }
        return answer;
    }
}
