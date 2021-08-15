package level1.level1_0809;

public class HarshadNumber {
    public boolean solution(int x) {
        String str = Integer.toString(x);
        int sum = 0;
        for(int i = 0 ; i < str.length() ; i++) {
            sum += Integer.parseInt(str.substring(i, i+1));
        }
        if(x % sum == 0) {
            return true;
        }
        return false;
    }
}
