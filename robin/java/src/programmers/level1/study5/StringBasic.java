package programmers.level1.study5;

public class StringBasic {
    public static boolean solution(String s) {

        if (s.chars().allMatch(Character::isDigit) && (s.length() == 4 || s.length() == 6)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "1234";
        System.out.println(solution(s));
    }
}
