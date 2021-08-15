package level2._0816;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TargetNumber {
    List<Integer> list = new ArrayList<>();

    public int solution(int[] numbers, int target) {
        int answer = 0;
        int sum = Arrays.stream(numbers).sum();
        int diff = (sum - target) / 2;
        boolean[] visited = new boolean[numbers.length];
        for(int r = 1; r <= numbers.length; r++) {

            comb1(numbers, visited, 0, r);

        }
        Collections.sort(list);

        if(diff == 0) {
            return 1;
        }

        for(int i = 0 ; i < list.size() ; i++) {
            if(list.get(i) == diff) {
                answer++;
            }
        }

        //조합으로 모든 수의 합을 찾고, 그 합과 diff가 같으면 answer++

        return answer;
    }

    //1. 백트래킹을 이용해 구현
    public void comb1(int[] arr, boolean[] visited, int start, int r) {
        List<Integer> sumList = new ArrayList<>();
        if(r == 0) {
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                if(visited[i] == true) {
                    sum += arr[i];
                }
            }
            // System.out.println("sum = " + sum);
            list.add(sum);
            sum = 0;
            //print(arr, visited);
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }

    // 리스트에 담기
    static void addList(int[] arr, boolean[] visited) {
        List<Integer> sumList = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true) {
                sum += arr[i];
            }
        }
        sumList.add(sum);
        sum = 0;
    }

}
