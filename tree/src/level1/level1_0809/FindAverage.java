package level1.level1_0809;

import java.util.Arrays;

public class FindAverage {
    public double solution(int[] arr) {
        return Arrays.stream(arr)
                .average()
                .orElseThrow();
    }
}
