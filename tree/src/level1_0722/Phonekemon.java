package level1_0722;

import java.util.HashSet;
import java.util.Set;

public class Phonekemon {
    public int solution(int[] nums) {
        int species = 0;

        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++) {
            set.add(nums[i]);
        }

        if((nums.length / 2) < set.size()) {
            return (nums.length / 2);
        }
        return set.size();
    }
}
