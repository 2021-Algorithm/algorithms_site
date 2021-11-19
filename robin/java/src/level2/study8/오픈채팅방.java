package level2.study8;

import java.util.*;

public class 오픈채팅방 {

    public static String[] solution(String[] record) {

        Deque<String> queue1 = new ArrayDeque<>(Arrays.asList(record));
        Map<String, String> map = new HashMap<>();
        Deque<String> queue2 = new ArrayDeque<>(Arrays.asList(record));

        List<String> answer = new ArrayList();

        while (!queue1.isEmpty()) {
            String[] flag = queue1.pollFirst().split(" ");

            if (flag[0].equals("Enter")) {
                map.put(flag[1], flag[2]);
            }

            if (flag[0].equals("Change")) {
                map.put(flag[1], flag[2]);
            }
        }

        while (!queue2.isEmpty()) {
            String[] flag = queue2.pollFirst().split(" ");

            if (flag[0].equals("Enter")) {
                answer.add(map.get(flag[1]) + "님이 들어왔습니다.");
            }

            if (flag[0].equals("Leave")) {
                answer.add(map.get(flag[1]) + "님이 나갔습니다.");
            }
        }

        return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));
    }
}
