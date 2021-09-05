package level1.level1_0729;

public class CountPY {

    boolean solution(String s) {
        s = s.toLowerCase();
        String[] arr = s.split("");
        int p = 0, y = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i].equals("p")) {
                p += 1;
            }
            if(arr[i].equals("y")) {
                y += 1;
            }
        }

        if(p == y) {
            return true;
        }
        else {
            return false;
        }
    }

    boolean oldSol(String s) {
        boolean answer = true;
        int countY = 0;
        int countP = 0;

        for(int x=0;x<s.length();x++){

            if(s.substring(x,x+1).toUpperCase().equals("Y")) {
                countY++;
            }if(s.substring(x,x+1).toUpperCase().equals("P")) {
                countP++;
            }
        }

        if(countY-countP != 0){
            answer = false;
        }
        return answer;
    }
}
