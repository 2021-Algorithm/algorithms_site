package level1.level1_0812;

public class AddSplitNumber {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(int i = 0 ; i < str.length() ; i++) {
            answer += Integer.parseInt(str.substring(i, i + 1));
        }

        return answer;
    }
}
