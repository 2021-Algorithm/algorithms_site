package level1_0729;

import java.util.Arrays;

public class FindMrKim {

    public String sol(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + index + "에 있다";
    }

    public String oldSol(String[] seoul) {
        String answer = "";
        int i = 0;
        for(int x=0;x<seoul.length;x++) {
            if(seoul[x].equals("Kim")){
                i = x;
            }
        }
        answer = "김서방은 " + i +"에 있다";
        return answer;
    }
}
