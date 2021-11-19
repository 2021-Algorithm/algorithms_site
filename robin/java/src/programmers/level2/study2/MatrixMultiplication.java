package programmers.level2.study2;

import java.util.Arrays;

public class MatrixMultiplication {

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int num1 = arr1.length;
        int num2 = arr2[0].length;

        int[][] answer = new int[num1][num2];


        for (int i = 0; i < arr1.length; i++) {

            int[] tempArray = new int[num2];

            for (int j = 0; j < arr2[0].length; j++) {
                int temp = 0;

                for (int k = 0; k < arr1[0].length; k++) {
                    temp += arr1[i][k] * arr2[k][j];


                }
                tempArray[j] = temp;
            }

            answer[i] = tempArray;

        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        System.out.println(Arrays.toString(solution(arr1, arr2)));
    }
}
