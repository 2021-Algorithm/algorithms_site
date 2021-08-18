package level2._0819_;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberList {

    //문제에서 제시한 해시(map)으로 풀이한 내용
    //list나 array는 이중 for문 사용 시 시간 초과되지만, map으로 풀 경우 괜찮다.
    public boolean sol1(String[] phone_book) {
         Map<String, Integer> hashMap = new HashMap<>();

             for (String number : phone_book) hashMap.put(number, 0);
             for (String key : hashMap.keySet())
                 for (int j = 1; j <= key.length() - 1; j++)
                     if (hashMap.containsKey(key.substring(0, j))) return false;
             return true;
    }
    //sort를 하면, 정렬이 되니까 만약에 접두사가 동일하다면 그 앞뒤에 위치하는 사실을 근거로 풀이
    public boolean sol2(String[] phone_book) {
        Arrays.sort(phone_book);
        boolean result = true;
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
    //처음에 풀었던 방식 array에서 직접 확인하니, n^2의 시간복잡도
    public boolean sol3(String[] phone_book) {
         for(int i = phone_book.length - 1; i >= 0 ; i--) {
             for(int j = 0 ; j < phone_book.length ; j++) {
                 if(phone_book[j].startsWith(phone_book[i]) && i != j) {
                     return false;
                 }
             }

         }
         return true;
    }
}
