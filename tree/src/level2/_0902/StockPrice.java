package level2._0902;

import java.util.ArrayList;
import java.util.List;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < prices.length ; i++) {
            list.add(prices[i]);
        }

        for(int i = 0 ; i < list.size() ; i++) {
            for(int j = i + 1 ; j < list.size() ; j++) {
                if(list.get(i) > list.get(j)) {
                    answer[i] = j - i;
                    break;
                }
                answer[i] = list.size() - i - 1;
            }
        }
        return answer;
    }
}
