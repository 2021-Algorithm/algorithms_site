package lever1_0726;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class PickTwoAndAdd {

    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();

        for(int i = 0 ; i < numbers.length ; i++) {
            for(int j = 0 ; j < numbers.length ; j++) {
                if(i != j) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }

        return set.stream().mapToInt(Number::intValue).toArray();
    }

    public int[] oldSol(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        //int[] sum = new int[numbers.length * (numbers.length-1) / 2];

        for(int x=0;x<numbers.length;x++) {
            for(int y=x+1;y<numbers.length;y++) {
                list.add(numbers[x] + numbers[y]);
            }
        }
        Collections.sort(list);
        ArrayList<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!finalList.contains(list.get(i))) {
                finalList.add(list.get(i));
            }
        }
        System.out.print(finalList);

        answer = new int[finalList.size()];
        for(int i=0;i<finalList.size();i++){
            answer[i] = finalList.get(i);
        }

        return answer;
    }


}
