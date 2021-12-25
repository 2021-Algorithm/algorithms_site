package baekjoon.shortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Node implements Comparable<Node> {

    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }

    // 거리(비용)가 짧은 것이 우선순위를 가지도록 설정
    @Override
    public int compareTo(Node o) {
        if (this.distance < o.distance) {
            return -1;
        }
        return 1;
    }
}

public class 특정거리의_도시찾기 {

    public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정

    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static int[] d = new int[300001];

    public static void dijkstra(int start) {

        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.offer(new Node(start, 0));
        d[start] = 0;

        while (!pq.isEmpty()) {

            Node node = pq.poll();
            int dist = node.getDistance();

            int now = node.getIndex();

            if (d[now] < dist) continue;
            // 현재 노드와 연결된 다른 인접한 노드들을 확인
            for (int i = 0; i < graph.get(now).size(); i++) {
                int cost = d[now] + graph.get(now).get(i).getDistance();
                // 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
                if (cost < d[graph.get(now).get(i).getIndex()]) {
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split(" "))
                .parallel().mapToInt(Integer::parseInt).toArray();

        int n = input[0]; //도시의 개수
        int m = input[1]; //도로의 개수
        int k = input[2]; //거리 정보
        int x = input[3]; //출발 도시의 번호

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<Node>());
        }

        for (int i = 0; i < m; i++) {
            String[] inputData = br.readLine().split(" ");
            int a = Integer.parseInt(inputData[0]);
            int b = Integer.parseInt(inputData[1]);

            graph.get(a).add(new Node(b, 1));
        }

        Arrays.fill(d, INF);

        dijkstra(x);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            if (d[i] == k) {
                result.add(i);
            }
        }

        if (result.size() == 0) {
            System.out.println(-1);

        } else {
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }
        }
    }
}
