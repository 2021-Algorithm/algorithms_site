package programmers.level1.study5;

public class FindMrKim {
    public static String solution(String[] seoul) {

        int x = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
                break;
            }
        }
        return "김서방은 " + x + "에 있다";
    }


    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }
}
