package level1.level1_0812;

public class MakeArrayByReverseNaturalNumber {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        for(int i = str.length() - 1; i >= 0 ; i--) {
            answer[str.length() - 1 - i] =
                    Integer.parseInt(str.substring(i, i+1));
        }
        return answer;
    }
}
