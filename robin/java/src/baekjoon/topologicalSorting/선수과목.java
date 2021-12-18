// https://dirmathfl.tistory.com/381


package baekjoon.topologicalSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class 선수과목 {


    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //노드의 개수와 간선의 개수를 입력받기
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        // 모든 노드에 대한 진입 차수 0으로 초기화
        int[] inDegree = new int[n + 1];

        //각 노드에 연결된 간선 정보를 담기 위한 연결 리스트(그래프) 초기화
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        //방향 그래프의 모든 간선 정보 입력받기
        for (int i = 0; i < m; i++) {
            String[] inputData = br.readLine().split(" ");
            int a = Integer.parseInt(inputData[0]);
            int b = Integer.parseInt(inputData[1]);
            graph.get(a).add(b);

            //진입차수를 1 증가
            inDegree[b] += 1;
        }

        topologySort(n, inDegree, graph);

    }

    private void topologySort(int n, int[] inDegree, ArrayList<ArrayList<Integer>> graph) {

        //선수과목 기반으로 차수 담기 위한 0으로 초기화한 어레이(몇 학기 만에 수강이 가능할지.)
        int[] inDegreeResult = new int[n + 1];

        //큐
        //큐를 돌리다보면 선수과목들 먼저 inDegreeResult가 채워진다.
        Deque<Integer> queue = new ArrayDeque<>();

        //알고리즘 수행 결과를 담을 리스트
        ArrayList<Integer> result = new ArrayList<>();

        //처음 시작할 때는 진입차수가 0인 노드를 큐에 삽입
        for (int i = 1; i < n + 1; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);

                //일단 큐에 들어갔다는 건 1학기 부터 시작.
                inDegreeResult[i] += 1;
            }
        }

        //큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            //큐에서 원소 꺼내기
            int now = queue.poll();
            result.add(now);

            //해당 원소와 연결된 노드들의 집입 차수에서 1빼기
            for (int i = 0; i < graph.get(now).size(); i++) {
                inDegree[graph.get(now).get(i)] -= 1;

                //now 라는 선수과목을 가지는 과목 = 해당 과목 + 1
                inDegreeResult[graph.get(now).get(i)] = inDegreeResult[now] + 1;

                //새롭게 진입차수가 0이 되는 노드를 큐에 삽입
                if (inDegree[graph.get(now).get(i)] == 0) {
                    queue.offer(graph.get(now).get(i));
                }
            }
        }

        //위상 정렬을 수행한 결과 출력
        for (int i = 1; i < inDegreeResult.length; i++) {
            System.out.print(inDegreeResult[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        선수과목 선수과목 = new 선수과목();
        선수과목.solution();
    }


}
