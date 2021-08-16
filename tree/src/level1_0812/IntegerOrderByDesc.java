package level1_0812;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerOrderByDesc {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        String[] arr = str.split("");
        List<Integer> list = Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .map(s->Integer.valueOf(s))
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(list.toArray()));
        String temp = "";
        for(int i = 0 ; i < list.size() ; i++) {
            temp += list.get(i);
        }
        return Long.parseLong(temp);
    }
}
