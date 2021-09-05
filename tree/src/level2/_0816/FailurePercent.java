package level2._0816;

import java.util.*;

public class FailurePercent {
    public static int[] sol(int N, int[] stages) {
        List<Integer> answerList = new ArrayList<>();
        Map<Integer,Double> map = new HashMap<>();

        Arrays.sort(stages);


        for(int i = 1 ; i <= N ; i++) {
            int finalI = i;
            long count = Arrays.stream(stages).filter(x -> x == finalI).count();
            long success = Arrays.stream(stages).filter(x -> x >= finalI).count();
            System.out.println("i = " + i + " , count = " + count + " , success = " + success);

            double percent = 0.0;
            if(success == 0) {
                System.out.println("here");
                percent = 0.0;
            }
            else {
                percent = (double)count/success;
            }
            map.put(i, percent);
        }

            map.entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .forEach(x -> answerList.add(x.getKey()));


        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        for(int i = 0 ; i < answer.length ; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] temp2 = new double[N][2];
        int tempNo = 0;
        int stageNo = 1;
        int total = stages.length;
        int success = 0;
        Arrays.sort(stages);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int key : stages) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i = 1; i <= N; i++) {
            if (map.get(i) != null) {
                success = map.get(i);
                temp2[tempNo][0] = (double) success / total;
                temp2[tempNo][1] = stageNo;
                total = total - success;
                tempNo++;
                stageNo++;
            } else if (map.get(i) == null) {
                temp2[tempNo][0] = 0;
                temp2[tempNo][1] = stageNo;
                stageNo++;
                tempNo++;
            }
        }

        Arrays.sort(temp2, Comparator.comparingDouble(o1 -> o1[0]));

        Arrays.sort(temp2, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Double.compare(o2[1], o1[1]);
            } else {
                return Double.compare(o1[0], o2[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            answer[N - i - 1] = (int) Math.round(temp2[i][1]);
            System.out.println((int) Math.round(temp2[i][1]) + "  " + i);
        }

        return answer;
    }

    public static void main(String[] args) {
//        sol(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
//        sol(4, new int[]{4,4,4,4,4});
        sol(5, new int[]{2,1,2,4,2,4,3,3});
    }
}
