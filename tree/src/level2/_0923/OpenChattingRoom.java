package level2._0923;

import java.util.*;

public class OpenChattingRoom {
    public static String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        for(int i = 0 ; i < record.length ; i++) {
            String[] line = record[i].split(" ");
            if(line[0].equals("Enter") || line[0].equals("Change")) {
                map.put(line[1], line[2]);
            }
        }
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < record.length ; i++) {
            String[] line = record[i].split(" ");
            String status = line[0];
            String pid = line[1];
            if(status.equals("Enter")) {
                list.add(map.get(pid) + "님이 들어왔습니다.");
            }
            else if(status.equals("Leave")) {
                list.add(map.get(pid) + "님이 나갔습니다.");
            }
        }

        return list.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"});
    }
}
