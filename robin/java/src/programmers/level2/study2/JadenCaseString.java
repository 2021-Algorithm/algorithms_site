package programmers.level2.study2;

public class JadenCaseString {
    public static String solution(String s) {
        String answer = "";

        s = " " + s;
        String[] ls = s.split("");

        for (int i = 1; i < ls.length; i++) {
            System.out.println(ls[i].toUpperCase());

            if (ls[i].equals(" ")) {
                answer += " ";
            }

            if (ls[i - 1].equals(" ")) {
                answer += ls[i].toUpperCase();
            } else {
                answer += ls[i].toLowerCase();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s));
    }
}
