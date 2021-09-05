package level1.level1_0809;

public class XRangeNumbersN {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i = 0 ; i < n ; i++) {
            answer[i] = x * (i + 1);
        }
        return answer;
    }
}
