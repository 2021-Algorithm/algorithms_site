package level1_0715;

import java.util.ArrayList;
import java.util.List;

public class CraneGame {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> tempList = new ArrayList<>();
        int[] tempArr = new int[moves.length];

        for(int i = 0 ; i < moves.length ; i++) {
            for(int j = 0 ; j < board.length ; j++) {
                if(board[j][moves[i] - 1] != 0) {
                    tempList.add(board[j][moves[i] - 1]);
                    tempArr[i] = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        for(int x = tempList.size() - 1; x > 0; x--) {
            if(tempList.get(x) == tempList.get(x-1)) {
                answer += 2;
                tempList.remove(x);
                tempList.remove(x - 1);
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        CraneGame c = new CraneGame();
        c.solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}); //4
    }
}
