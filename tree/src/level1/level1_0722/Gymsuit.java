package level1.level1_0722;

import java.util.Arrays;

public class Gymsuit {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        /*
        질문하기 보고 테스트 케이스 추가
        체육복을 잃어버린 사람과 여분을 가지고 있는 사람이 동일하다는 것은 이해가 안되었으나, 제한사항에 표기되있네?!!
        n(int)	lost(int[])	reserve(int[])  Return
        5      [2, 3, 4]     [3, 4, 5]       4
         */

        for(int i = 0 ; i < lost.length ; i++) {
            for(int j = 0 ; j < reserve.length ; j++) {
                if(lost[i] == reserve[j]) {
                    answer += 1;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }

        for(int i = 0 ; i < lost.length ; i++) {
            for(int j = 0 ; j < reserve.length ; j++) {
                if(Math.abs(lost[i] - reserve[j]) == 1) {
                    answer += 1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
