package level1.level1_0812;

public class VerifySquareRoot {
    public long solution(long n) {
        for(long i = 0 ; i * i <= n ; i++) {
            if(i * i == n) {
                return (i + 1) * (i + 1);
            }
        }
        return -1;
    }
}
