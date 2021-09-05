package level2._0816;

import java.math.BigInteger;

public class CountSquare {
    public long solution(int w, int h) {
        long answer = 0;
        //기울기로 접근?
        double slope = (double)h/w;
        for(int i = 0 ; i < w ; i++) {

            answer += (int)((double)h*i/w);
        }

        return answer * 2;
    }

    public long sol2(int w, int h) {
        long totalCount = (long) w * (long) h;
        long diagonalCount = w + h - BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).longValue();

        return totalCount - diagonalCount;
    }
}
