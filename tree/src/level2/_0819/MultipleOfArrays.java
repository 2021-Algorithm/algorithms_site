package level2._0819;

public class MultipleOfArrays {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        int temp = 0;
        for(int i = 0 ; i < answer.length ; i++) { //arr1 의 행만큼(줄만큼)
            for (int j = 0; j < answer[0].length; j++) { // arr2의 렬만큼(칸만큼)
                for (int k = 0; k < arr1[0].length; k++) {
                    temp += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = temp;
                temp = 0;
            }
        }

        for(int i = 0 ; i < answer.length ; i++) {
            for(int j = 0 ; j < answer[0].length ; j++) {
                System.out.print(answer[i][j] + "\t");
            }
            System.out.println();
        }

        return answer;
    }
}
