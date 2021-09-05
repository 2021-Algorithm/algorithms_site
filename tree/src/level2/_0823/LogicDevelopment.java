package level2._0823;

import java.util.ArrayList;
import java.util.List;

public class LogicDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
//         int[] answer = {};

        List<Integer> list = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0 ; i < progresses.length ; i++) {
            double doubleDays = (double)(100 - progresses[i]) / speeds[i];
            int days = (int)Math.ceil(doubleDays);
            System.out.println(days);
            list.add(days);
        }

        for(int i = 0 ; i < list.size() ; i++) {
            int standard = list.get(i);
            int count = 1;
            if(standard < 0) {
                continue;
            }
            for(int j = i + 1 ; j < list.size() ; j++) {
                int compare = list.get(j);
                if(standard >= compare){
                    list.set(j, -1); //조사가 완료되었으므로 대상에서 제거 합니다.
                    count++;
                } else {
                    break;
                }
            }
            answerList.add(count);

        }

        return answerList.stream().mapToInt(i->i).toArray();

    }
}
