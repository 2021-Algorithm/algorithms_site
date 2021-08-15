package level1.level1_0802;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysOfZeroRemainder {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        if(answer.length == 0) {
            answer = new int[]{-1};
        }
        return answer;
    }

    public int[] oldSol(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }


        if(list.size() != 0){
            answer = new int[list.size()];
            for(int i=0;i<list.size();i++){
                answer[i] = list.get(i);

            }

        }else{
            answer = new int[1];
            answer[0] = -1;

        }

        Arrays.sort(answer);
        return answer;
    }
}
