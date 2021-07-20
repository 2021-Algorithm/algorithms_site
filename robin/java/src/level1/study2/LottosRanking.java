package level1.study2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LottosRanking {
    public static int[] solution(int[] lottos, int[] win_nums) {

        int[] ranking = {6, 6, 5, 4, 3, 2, 1};

        List<Integer> lottosList = new ArrayList(Arrays.asList(lottos));

        int containVal = 0;
        int containZero = 0;


        for (int i = 0; i < lottos.length; i++) {

            if (lottos[i] == 0) {
                containZero += 1;
            }

            for (int j = 0; j < win_nums.length; j++) {

                if (lottos[i] == win_nums[j]) {
                    containVal += 1;
                }
            }
        }

        return new int[]{ranking[containVal + containZero], ranking[containVal]};
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }
}
