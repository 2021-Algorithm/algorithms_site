package level1_0809;

public class ReplacePhoneNumber {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0 ; i < phone_number.length() ; i++) {
            if(i < phone_number.length() - 4) {
                answer += "*";
            }
            else {
                answer += phone_number.substring(i, i+1);
            }
        }
        return answer;
    }
}
