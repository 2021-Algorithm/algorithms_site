package level1.level1_0802;

import java.util.ArrayList;
import java.util.List;

public class HateSameNumber {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] >= 0 && arr[i] < 10) {
                list.add(arr[i]);
            }
        }

        for(int i = list.size() - 1 ; i > 0 ; i--) {
            if(list.get(i).equals(list.get(i-1))) {
                list.remove(i);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++) {
            answer[i] = list.get(i);
        }

        //return list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
