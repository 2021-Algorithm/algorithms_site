package level2._0816;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class MakeHotter {
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.addAll(Arrays.stream(scoville).boxed().collect(Collectors.toList()));

        while(queue.size() > 1 && queue.peek() < K) {
            int a = (int)queue.poll();
            System.out.println("a = " + a);
            int b = (int)queue.poll();
            System.out.println("b = " + b);
            queue.add(a + b * 2);
            answer++;
        }
        if(queue.size() <= 1 && queue.peek() < K) {
            return -1;
        }

        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
    }
}
