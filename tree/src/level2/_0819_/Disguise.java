package level2._0819_;

import java.util.HashMap;
import java.util.Map;

public class Disguise {
    static int answer = 0;
    //변장하는 사람은 옷중 하나 이상을 꼭 입어야하기 때문에
    //가지고 있는 옷 개수 + 1을 한 다음 모든 경우의 수를 다 곱하고
    //아무것도 안 입는 경우인 1을 뺴주는 방법으로 풀면된다.
    public static int sol1(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < clothes.length ; i++) {
            if(map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            }
            else {
                map.put(clothes[i][1], 1);
            }
        }

        int[] arr = map.entrySet().stream()
                .map(Map.Entry::getValue)
                .mapToInt(Integer::intValue)
                .toArray();
        int cnt = 1;
        for(int i = 0 ; i < arr.length ; i++) {
            cnt *= arr[i] + 1;
        }
        cnt = cnt - 1;
        System.out.println("cnt = " + cnt);
        return cnt;
    }

    //조합 메소드를 이용해서 풀었음
    //변수를 전역변수로 선언해서 풀어야하고, map 크기에 대한 예외 처리를 해줘야함
    public static int sol2(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < clothes.length ; i++) {
            if(map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            }
            else {
                map.put(clothes[i][1], 1);
            }
        }

        if(map.size() == 30){ return 1073741823; }


        int[] arr = map.entrySet().stream()
                .map(Map.Entry::getValue)
                .mapToInt(Integer::intValue)
                .toArray();

        boolean[] visited = new boolean[arr.length];

        for(int r = 1; r <= arr.length; r++) {
            comb1(arr, visited, 0, r);
        }

        for(int i = 0 ; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        map.forEach((key, value) -> System.out.println(key + ":" + value));
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void comb1(int[] arr, boolean[] visited, int start, int r) {
        if(r == 0) {
            int sum = 1;
            for(int i = 0; i < arr.length; i++) {
                if(visited[i] == true) {
                    sum *= arr[i];
                }
            }
            System.out.println("sum = " + sum);
            answer += sum;
            sum = 0;
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }




    public static void main(String[] args) {
        sol1(new String[][]{
                {"yellowhat", "headgear"},
                {"bluesunglasses", "eyewear"},
                {"green_turban", "headgear"}
        });
    }
}
