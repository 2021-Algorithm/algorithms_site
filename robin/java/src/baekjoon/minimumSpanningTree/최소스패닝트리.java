package baekjoon.minimumSpanningTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//이코테 크루스칼 알고리즘
class Egde implements Comparable<Egde> {

    private int distance;
    private int nodeA;
    private int nodeB;

    public Egde(int distance, int nodeA, int nodeB) {
        this.distance = distance;
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    public int getNodeA() {
        return nodeA;
    }

    public int getNodeB() {
        return nodeB;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Egde o) {

        if (this.distance < o.distance) {
            return -1;
        }
        return 1;
    }
}

public class 최소스패닝트리 {

    // 노드의 개수(V)와 간선(Union 연산)의 개수(E)
    // 노드의 개수는 최대 100,000개라고 가정
    public static int v, e;
    public static int[] parent = new int[100001]; // 부모 테이블 초기화하기

    // 모든 간선을 담을 리스트와, 최종 비용을 담을 변수
    public static ArrayList<Egde> edges = new ArrayList<>();

    public static int result = 0;

    // 특정 원소가 속한 집합을 찾기
    public static int findParent(int x) {
        // 루트 노드가 아니라면, 루트 노드를 찾을 때까지 재귀적으로 호출
        if (x == parent[x]) return x;
        return parent[x] = findParent(parent[x]);
    }

    // 두 원소가 속한 집합을 합치기
    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = br.readLine().split(" ");

        v = Integer.parseInt(input1[0]);
        e = Integer.parseInt(input1[1]);


        for (int i = 1; i < v + 1; i++) {
            parent[i] = i;
        }


        for (int i = 0; i < e; i++) {
            String[] inputNode = br.readLine().split(" ");

            int a = Integer.parseInt(inputNode[0]);
            int b = Integer.parseInt(inputNode[1]);
            int cost = Integer.parseInt(inputNode[2]);
            edges.add(new Egde(cost, a, b));
        }

        Collections.sort(edges);

        for (int i = 0; i < edges.size(); i++) {
            int cost = edges.get(i).getDistance();
            int a = edges.get(i).getNodeA();
            int b = edges.get(i).getNodeB();
            // 사이클이 발생하지 않는 경우에만 집합에 포함
            if (findParent(a) != findParent(b)) {
                unionParent(a, b);
                result += cost;
            }
        }

        System.out.println(result);
    }
}
