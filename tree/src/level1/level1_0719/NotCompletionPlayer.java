package level1.level1_0719;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NotCompletionPlayer {

    public String sol1(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i = 0 ; i < completion.length ; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }

    //효율성 x
    public String sol2(String[] participant, String[] completion) {
        String answer = "";

        for(int i = 0 ; i < participant.length ; i++) {
            for(int j =  0 ; j < completion.length ; j++) {

                if(participant[i].equals(completion[j])) {
                    completion[j] = "";
                    participant[i] = "";
                }
            }
        }

        for(int k = 0 ; k < participant.length ; k++) {
            answer += participant[k];
        }

        return answer;
    }

    public String sol3(String[] participant, String[] completion) {
        String answer = "";
        int value = 0;

        Map<String, Integer> hashMap = new HashMap<>();

        for(String part : participant) {
            if(hashMap.get(part) == null) {
                hashMap.put(part, 1);
            }
            else {
                value = hashMap.get(part) + 1;
                hashMap.put(part, value);
            }
        }

        for(String comp : completion) {
            value = hashMap.get(comp) - 1;
            hashMap.put(comp, value);
        }

        for(String key : hashMap.keySet()) {
            if(hashMap.get(key) == 1) {
                answer = key;
            }
        }
        return answer;
    }

    public String sol4(String[] participant, String[] completion) {
        Map<String, Integer> hashMap = new HashMap<>();

        for(String part : participant) {
            hashMap.put(part, hashMap.getOrDefault(part, 0) + 1);
        }

        for(String comp : completion) {
            hashMap.put(comp, hashMap.get(comp) - 1);
        }

        for(String key : hashMap.keySet()) {
            if(hashMap.get(key) != 0) {
                return key;
            }
        }
        return null;
    }

    public String sol5(String[] participant, String[] completion) {
        Map<Integer, String> hashMap = new HashMap<>();
        long temp = 0L;

        for(String part : participant) {
            hashMap.put(part.hashCode(), part);
            temp += part.hashCode();
        }

        for(String comp : completion) {
            temp -= comp.hashCode();
        }

        for(int key : hashMap.keySet()) {
            System.out.println("hashMap = " + key + "," + hashMap.get(key));
        }
        System.out.println("temp = " + temp);
        System.out.println(hashMap.get((int)temp));

        return hashMap.get((int)temp);
    }


    public static void main(String[] args) {
        NotCompletionPlayer n = new NotCompletionPlayer();
        n.sol5(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
    }

}
