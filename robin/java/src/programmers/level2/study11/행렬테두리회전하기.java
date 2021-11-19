package programmers.level2.study11;

import java.util.Arrays;

public class 행렬테두리회전하기 {

    private int rotate(int idx, int[][] queries, int[][] rowsXColumns) {
        int x1 = queries[idx][0] - 1;
        int y1 = queries[idx][1] - 1;
        int x2 = queries[idx][2] - 1;
        int y2 = queries[idx][3] - 1;

        int array = rowsXColumns[x1][y1];
        int min = 123456789;

        for (int i = x1; i < x2; i++) {
            if (min > rowsXColumns[i][y1]) min = rowsXColumns[i][y1];
            rowsXColumns[i][y1] = rowsXColumns[i + 1][y1];
        }

        for (int i = y1; i < y2; i++) {
            if (min > rowsXColumns[x2][i]) min = rowsXColumns[x2][i];
            rowsXColumns[x2][i] = rowsXColumns[x2][i + 1];
        }

        for (int i = x2; i > x1; i--) {
            if (min > rowsXColumns[i][y2]) min = rowsXColumns[i][y2];
            rowsXColumns[i][y2] = rowsXColumns[i - 1][y2];
        }

        for (int i = y2; i > y1; i--) {
            if (min > rowsXColumns[x1][i]) min = rowsXColumns[x1][i];
            rowsXColumns[x1][i] = rowsXColumns[x1][i - 1];
        }

        rowsXColumns[x1][y1 + 1] = array;
        return min;
    }

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        int[][] rowsXColumns = new int[rows][columns];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowsXColumns[i][j] = value++;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            answer[i] = rotate(i, queries, rowsXColumns);
        }

        return answer;
    }

    public static void main(String[] args) {
        행렬테두리회전하기 행렬테투리회전하기 = new 행렬테두리회전하기();

        int rows = 6;
        int columns = 6;
        int[][] queries = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
        System.out.println(Arrays.toString(행렬테투리회전하기.solution(rows, columns, queries)));
    }
}
