package level1.lever1_0726;

public class Ternary {
    public int solution(int n) {

        int answer = 0;
        String s3 = "";
        while (n > 0) {
            s3 += (n % 3);
            n /= 3;
        }
        String[] reverseArr = s3.split("");

        for(int i = reverseArr.length - 1 ; i >= 0 ; i--) {
            answer += Integer.parseInt(reverseArr[i]) * Math.pow(3 , reverseArr.length - 1 - i);
        }

        return answer;
    }
}
