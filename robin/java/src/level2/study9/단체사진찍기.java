package level2.study9;

import java.util.*;

/*
 * 첫번째 예제:
 * 네오와 프로도는 나란히 서기. 즉, 간격이 0
 * 라이언은 튜브에게서 적어도 3칸 이상 떨어져있기. 즉 간격이 2보다 큼.
 * */
public class 단체사진찍기 {

    public int solution(int n, String[] data) {
        int answer = 0;
        String[] arr = {"A", "C", "F", "J", "M", "N", "R", "T"};

        List<String> permutationLs = new ArrayList();
        permutation(arr, 0, 8, 8, permutationLs);


        for (String str : permutationLs) {
            if (check(str, data)) {
                answer++;
            }
        }

        return answer;
    }

    public static Boolean check(String str, String[] data) {
        for (String value : data) {

            int a = str.indexOf(String.valueOf(value.charAt(0)));
            int b = str.indexOf(String.valueOf(value.charAt(2)));
            char c = value.charAt(3);
            int d = value.charAt(4) - '0' + 1;
            if (c == '>') {
                if (Math.abs(a - b) <= d) {
                    return false;
                }
            }
            else if (c == '<') {
                if (Math.abs(a - b) >= d) {
                    return false;
                }
            }
            else {
                if (Math.abs(a - b) != d) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void permutation(String[] arr, int depth, int n, int r, List<String> permutationLs) {
        if (depth == r) {
            String arrayToString = String.join("", arr);
            permutationLs.add(arrayToString);
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r, permutationLs);
            swap(arr, depth, i);
        }
    }

    public static void swap(String[] arr, int depth, int i) {
        String temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        단체사진찍기 단체사진찍기 = new 단체사진찍기();
        int n = 2;
        String[] data = {"N~F=0", "R~T>2"};
        System.out.println(단체사진찍기.solution(n, data));
    }
}
