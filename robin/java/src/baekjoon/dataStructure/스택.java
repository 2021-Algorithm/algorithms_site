package baekjoon.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            String instruction = input[0];

            if (instruction.equals("push")) {
                int num = Integer.parseInt(input[1]);
                stack.push(num);
            }

            if (instruction.equals("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            }

            if (instruction.equals("size")) {
                System.out.println(stack.size());
            }

            if (instruction.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            }

            if (instruction.equals("top")) {
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        }
    }
}
