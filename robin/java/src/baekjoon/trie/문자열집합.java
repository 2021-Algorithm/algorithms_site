package baekjoon.trie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 문자열집합 {

    public static Map<String, Boolean> hm = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n; i++) {
            hm.put(br.readLine(), true);
        }

        int cntSearch = 0;

        for (int i = 0; i < m; i++) {
            if (hm.get(br.readLine()) != null) cntSearch++;
        }

        System.out.println(cntSearch);

    }
}
