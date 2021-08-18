package level2._0819;

public class JadenCase {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length() ; j++) {
                if(j == 0) {
                    answer += arr[i].substring(j, j+1).toUpperCase();
                }
                else {
                    answer += arr[i].substring(j, j+1).toLowerCase();
                }
            }

            // answer += arr[i].substring(0,1).toUpperCase();
            // answer += arr[i].substring(1).toLowerCase();

            if(i != arr.length -1) {
                answer += " ";
            }
        }
        if(answer.length() != s.length()) {
            answer += " ".repeat(s.length() - answer.length());
        }
        System.out.println(answer);
        return answer;
    }
}
