package level2.study9;

public class 조이스틱 {

    private static char A = 65;
    private static char Z = 90;

    public int joystickUpDown(char s) {
        return Math.min(s - A, Z - s + 1);
    }

    public int solution(String name) {
        int answer = 0;
        int move = name.length() - 1; // 우선 앞에서부터 차례대로 조이스틱을 오른쪽으로 움직이는 것으로 초기화

        for (int i = 0; i < name.length(); i++) {

            answer += joystickUpDown(name.charAt(i));

            int next = i + 1;

            while (next < name.length() && name.charAt(next) == A) { //A를 만나면 왼쪽으로 가는 게 더 짧은지 검사하기 위함.
                next++;
            }
            move = Math.min(move, i + name.length() - next + Math.min(i, name.length() - next));
                                   //i + name.length() - next  + i = 현재까지 왔다가 다시 돌아가서 남은 거 까지 가는 갯수
                                   //Math.min(i, name.length() = 맨 끝이 A일 때 돌아갈 필요가 없기 때문에 name.length() - next 깂이 0 이 나와 무조건 다 작은 수가 나온다.
        }

        answer += move;

        return answer;
    }

    public static void main(String[] args) {
        조이스틱 조이스틱 = new 조이스틱();
        //String name = "ABAAAAAAAAABB";
        String name = "ABA";
        //String name = "JEROEN";
        System.out.println(조이스틱.solution(name));
    }
}


