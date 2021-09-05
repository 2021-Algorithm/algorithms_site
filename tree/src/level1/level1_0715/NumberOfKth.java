package level1.level1_0715;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfKth {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> tempArr = new ArrayList<>();
        for(int i = 0 ; i < commands.length ; i++) {
            for(int j = commands[i][0] - 1 ; j < commands[i][1] ; j++) {
                tempArr.add(array[j]);
            }
            tempArr.sort(null);
            answer[i] = tempArr.get(commands[i][2] - 1);
            tempArr.clear();
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        NumberOfKth n = new NumberOfKth();
        n.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}); //[5,6,3]
    }
}
