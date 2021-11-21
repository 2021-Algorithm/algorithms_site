package programmers.level2.study10;

public class 좌물쇠와열쇠 {

    private int[][] degree90(int[][] array) {
        int n = array.length;
        int m = array[0].length;
        int[][] degree = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                degree[j][n - i - 1] = array[i][j];
            }
        }

        return degree;
    }

    private boolean check(int[][] checkArray) {

        int checkLength = checkArray.length / 3;

        for (int i = checkLength; i < checkLength * 2; i++) {
            for (int j = checkLength; j < checkLength * 2; j++) {
                if (checkArray[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean keyIn(int[][] key, int[][] board) {

        int n = (board.length / 3) * 2;
        int m = key.length;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                // 자물쇠에 열쇠를 끼워 넣기
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        board[x + i][y + j] += key[i][j];
                    }
                }
                // 새로운 자물쇠에 열쇠가 정확히 들어 맞는지 검사
                if (check(board)) return true;
                // 자물쇠에서 열쇠를 다시 빼기
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        board[x + i][y + j] -= key[i][j];
                    }
                }
            }
        }
        return false;
    }

    public boolean solution(int[][] key, int[][] lock) {
        int n = lock.length;
        int m = key.length;

        int[][] board = new int[n * 3][n * 3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i + n][j + n] = lock[i][j];
            }
        }

        int num = 0;
        while (num < 4){
            if(keyIn(key, board)){
                return true;
            }
            key = degree90(key);
            num ++;
        }
        return false;
    }

    public static void main(String[] args) {
        좌물쇠와열쇠 좌물쇠와열쇠 = new 좌물쇠와열쇠();
        int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println(좌물쇠와열쇠.solution(key, lock));
    }
}

/*int [][] door = new int[7][7];

        for (int i = 2; i < 5; i++) {
            for (int j = 2; j < 5; j++) {
                door[i][j] = lock[i - 2][j - 2];
            }
        }

        for (int i = 0; i < door.length; i++) {
            System.out.println(Arrays.toString(door[i]));
        }*/