package level1.study3;

import java.util.HashSet;
import java.util.Set;

public class PocketMon {

    public static int solution(int[] nums) {

        int maxPocketMon = nums.length / 2;

        Set<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        return Math.min(maxPocketMon, hs.size());
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));
    }
}
