package level2._0819;

public class LCDOfNumbers {
    public int solution(int[] arr) {
        int divisor = arr[0];
        int common = arr[0];
        for(int i = 1 ; i < arr.length ; i++) {
            divisor = gcd(common, arr[i]);
            common = common * arr[i] / divisor;
        }
        return common;
    }

    public int gcd(int i, int j) {
        if (j == 0) {
            return i;
        }
        else {
            return gcd(j, i % j);
        }
    }
}
