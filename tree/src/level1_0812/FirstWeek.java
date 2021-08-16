package level1_0812;

public class FirstWeek {
    public long solution(int price, int money, int count) {
        long expect = 0;
        for(int i = 1; i <= count ; i++) {
            expect += (long)(i * price);
        }
        if(expect <= money) {
            return 0;
        }
        return expect - money;
    }
}
