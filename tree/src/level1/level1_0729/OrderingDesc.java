package level1.level1_0729;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OrderingDesc {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0 ; i < arr.length ; i++) {
            answer += arr[i];
        }
        return answer;
    }

    public String oldSol(String s) {
        String answer = "";
        ArrayList<String> list = new ArrayList<String>();
        String[] arr = new String[s.length()];

        for(int i=0;i<s.length();i++){
            list.add(s.substring(i,i+1));
            arr[i] = s.substring(i,i+1);
        }

        //Descending descending = new Descending();
        //Collections.sort(list, descending);

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[0]);

        for(int i=0;i<arr.length;i++){
            answer = answer + arr[i];
        }


        return answer;
    }
}
