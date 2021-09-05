package level2._0826;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int[] sorted = IntStream.of(citations)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        for(int i = 0 ; i < sorted.length ; i++) {
            if(sorted[i] <= (i + 1) ) {
                return sorted[i];
            }
        }

        //0 1 3 5 6



        return answer;
    }
}
