package level1.study2;

import java.util.*;

public class PlayerNotCompleteRace {

    public static String solution(String[] participant, String[] completion) {

        String answer = "";

        Map<String, Integer> hm = new HashMap();

        for (String player : participant) {

            if (!hm.containsKey(player)) {
                hm.put(player, 1);
            } else {
                hm.put(player, hm.get(player) + 1);
            }
        }

        for (String player : completion) {

            if (hm.containsKey(player)) {
                hm.put(player, hm.get(player) - 1);
            }

        }

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));

    }
}
