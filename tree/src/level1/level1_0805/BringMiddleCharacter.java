package level1.level1_0805;

public class
BringMiddleCharacter {

    public String solution(String s) {
        int temp = s.length() / 2;
        if(s.length() % 2 == 1) {
            return s.substring(temp, temp + 1);
        }
        return s.substring(temp - 1, temp + 1);
    }

    public String oldSol(String s) {
        String answer = "";
        int sLength = s.length();

        if(sLength % 2 == 0){
            int result = sLength / 2;
            //String re = Integer.toString(result);
            //answer = re;
            answer = s.substring(result-1,result+1);
        }else{
            int result = sLength / 2 + 1;
            //String re = Integer.toString(result);
            //answer = re;
            answer = s.substring(result-1,result);
        }

        return answer;
    }
}
