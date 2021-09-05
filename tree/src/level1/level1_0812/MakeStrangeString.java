package level1.level1_0812;

public class MakeStrangeString {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1);
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length() ; j++) {
                if(j % 2 == 0) {
                    answer += arr[i].substring(j, j+1).toUpperCase();
                }
                else {
                    answer += arr[i].substring(j, j+1).toLowerCase();
                }
            }
            if(i < arr.length - 1) {
                answer += " ";
            }
        }
        return answer;
    }
}
