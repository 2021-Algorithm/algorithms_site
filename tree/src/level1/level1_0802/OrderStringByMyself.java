package level1.level1_0802;

import java.util.*;

public class OrderStringByMyself {

    public <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        Map<String, String> map = new HashMap<>();
        for(int i = 0 ; i < strings.length ; i++) {
            System.out.println(strings[i].substring(n, n+1));
            map.put(strings[i], strings[i].substring(n, n+1));
        }

        // for(int i = 0 ; i < map.size() ; i++) {
        //     map.get(strings[i]);
        // }

        map = sortByValue(map);

        for ( String key : map.keySet() ) {
            System.out.println( key );
        }

        return answer;
    }

}
