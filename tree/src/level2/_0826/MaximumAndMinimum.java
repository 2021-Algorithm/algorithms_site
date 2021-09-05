package level2._0826;

import java.util.Arrays;

public class MaximumAndMinimum {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(intArr);
        System.out.println(intArr[0]);
        answer = intArr[0] + " " + intArr[intArr.length - 1];
        return answer;
    }
}
