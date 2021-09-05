package level2._0823;

import java.util.*;

public class Printer {

    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            queue.offer(priority);
        }

        System.out.println(queue);

        while(!queue.isEmpty()) {
            for(int i = 0 ; i < priorities.length ; i++) {
                if(queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    if(location == i) {
                        queue.clear();
                        break;
                    }
                }
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }

    public int sol1(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for(int i = 0 ; i < priorities.length ; i++) {
            queue.offer(new AbstractMap.SimpleEntry<>(i, priorities[i]));
        }
        System.out.println(queue);
        boolean isOut = false;
        while (!isOut) {
            if(queue.poll().getKey() == location) {
                isOut = true;
            }
            answer++;
        }

        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.solution(new int[]{1, 1, 9, 1, 1, 1}, 0); //5
        // c d e f a b -> 2 3 4 5 0 1
      //  solution(new int[]{2, 1, 3, 2}, 2); //1

    }
}
