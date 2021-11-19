package programmers.level2.study10;


import java.util.*;

public class 짝지어제거하기 {
    public int solution(String s) {

        String[] str = s.split("");
        Deque<String> stack = new ArrayDeque<>();

        for (String one : str) {

            if (stack.isEmpty()) {
                stack.add(one);
            } else {
                if (stack.getLast().equals(one)) {
                    stack.pollLast();
                } else {
                    stack.addLast(one);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }


    public int solution38(String s) {
        Deque<String> str = new ArrayDeque<>(Arrays.asList(s.split("")));

        int i = 0;
        while (!str.isEmpty()) {
            int size = str.size();

            if (i == size) {
                break;
            }

            String pop = str.poll();

            if (!pop.equals(str.getFirst())) {
                str.addLast(pop);
                i++;
            } else {
                str.pop();
                i = 0;
            }
        }

        if (str.isEmpty()) return 1;
        return 0;
    }


    public static void main(String[] args) {
        짝지어제거하기 짝지어제거하기 = new 짝지어제거하기();
        String s = "cdcd";
        System.out.println(짝지어제거하기.solution(s));
    }
}
