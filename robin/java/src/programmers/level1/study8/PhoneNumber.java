package programmers.level1.study8;

public class PhoneNumber {

    public static String solution(String phone_number) {
        String answer = "*".repeat(phone_number.substring(0, (phone_number.length() - 4)).length())
                + phone_number.substring((phone_number.length() - 4));
        return answer;
    }

    public static void main(String[] args) {
        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }
}
