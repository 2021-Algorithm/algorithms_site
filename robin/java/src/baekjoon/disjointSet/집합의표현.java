package baekjoon.disjointSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 집합의표현 {

    // 이코테 서로소 집합 알고리즘
    private int findParent(Integer[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = findParent(parent, parent[x]);
        }
        return parent[x];
    }

    private void unionParent(Integer[] parent, int a, int b) {
        a = findParent(parent, a);
        b = findParent(parent, b);

        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        Integer n = Integer.parseInt(str[0]);
        Integer m = Integer.parseInt(str[1]);

        Integer[] parent = new Integer[n + 1];

        //부모 테이블 상에서, 부모를 자기 자신으로 초기화
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++) {

            String[] input = br.readLine().split(" ");

            int flag = Integer.parseInt(input[0]);
            int a = Integer.parseInt(input[1]);
            int b = Integer.parseInt(input[2]);

            if (flag == 0) {
                unionParent(parent, a, b);
            } else {

                if (findParent(parent, a) == findParent(parent, b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }

    }


    public static void main(String[] args) throws IOException {
        집합의표현 집합의표현 = new 집합의표현();
        집합의표현.solution();
    }
}

