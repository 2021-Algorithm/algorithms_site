package baekjoon.dataStructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class 나는야포켓몬마스터이다솜 {

    public static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n; i++) {
            String inputStr = br.readLine();
            // key :"pokemon", value: 1
            map.put(inputStr, Integer.toString(i + 1));
            // key: 1, value: "pokemon"
            map.put(Integer.toString(i + 1), inputStr);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            System.out.println(map.get(str));
        }
    }
}


