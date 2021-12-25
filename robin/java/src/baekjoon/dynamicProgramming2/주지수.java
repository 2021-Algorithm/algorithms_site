package baekjoon.dynamicProgramming2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 주지수 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] array = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            String[] inData = br.readLine().split(" ");

            for (int j = 1; j <= m; j++) {
                array[i][j] = array[i - 1][j] + array[i][j - 1] - array[i - 1][j - 1] + Integer.parseInt(inData[j - 1]);
            }
        }

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {

            String[] inputXY = br.readLine().split(" ");
            int x1 = Integer.parseInt(inputXY[0]);
            int y1 = Integer.parseInt(inputXY[1]);
            int x2 = Integer.parseInt(inputXY[2]);
            int y2 = Integer.parseInt(inputXY[3]);

            System.out.println(array[x2][y2] - array[x1 - 1][y2] - array[x2][y1 - 1] + array[x1 - 1][y1 - 1]);

        }
    }
}
