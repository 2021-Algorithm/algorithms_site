package level2._0823;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public int solution(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i <= n ; i++) {
            map.put(0, 0);
            map.put(1, 1);
            if(i > 1) {
                int value = map.get(i - 1) + map.get(i - 2);
                map.put(i, value % 1234567);
            }

        }
        return map.get(n);

        // return answer;
    }

    public static int dongbinFibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return dongbinFibo(x - 1) + dongbinFibo(x - 2);
    }

    public static void main(String[] args) {
        System.out.println(dongbinFibo(4));
    }

}
