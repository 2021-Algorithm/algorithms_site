package level1_0719;

import java.util.ArrayList;
import java.util.List;

public class LottoMaxMin {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int temp = 0;
        List<Integer> knownNums = new ArrayList<>();

        for(int i = 0 ; i < lottos.length ; i++) {
            if(lottos[i] != 0) {
                knownNums.add(lottos[i]);
            }
        }

        for(int i = 0 ; i < knownNums.size() ; i++) {
            for(int j = 0 ; j < win_nums.length ; j++) {
                if(knownNums.get(i) == win_nums[j]) {
                    temp += 1;
                }
            }
        }

        answer[0] = knownNums.size() + 1 - temp;
        answer[1] = 7 - temp;

        for(int i = 0 ; i < answer.length ; i++) {
            if (answer[i] == 7)
                answer[i] = 6;
        }

        return answer;
    }

    public static void main(String[] args) {
        LottoMaxMin l = new LottoMaxMin();
        l.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
        l.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25});
        l.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35});
    }
}
