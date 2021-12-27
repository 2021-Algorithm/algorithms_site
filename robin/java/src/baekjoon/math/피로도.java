package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피로도 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        // 피로도
        int a = Integer.parseInt(input[0]);

        // 일 처리
        int b = Integer.parseInt(input[1]);

        // 쉴 때
        int c = Integer.parseInt(input[2]);

        // limit
        int m = Integer.parseInt(input[3]);

        int time = 24;
        int tired = 0;
        int process = 0;

        while (time > 0) {


            if (tired + a <= m) {
                tired += a;
                process += b;

            } else {
                tired -= c;

                if (tired < 0) {
                    tired = 0;
                }
            }

            time--;
        }

        System.out.println(process);
    }
}
