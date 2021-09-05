package level2._0826;

import java.util.*;
import java.util.function.Predicate;

public class BiggestNumber {
    static List<String> list = new ArrayList<>();
    static String[] answerArr;

    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        String temp = "";
        if (depth == r) {
            for(int i =0 ; i < r; i++) {
                temp = temp +output[i];
                System.out.print(output[i]+" ");
            }
            System.out.print("\t" + temp);
            System.out.println();
            list.add(temp);
            return;
        }
        for (int i=0; i<n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;;
            }
        }
    }
    //미친 풀이, 모든 경우의 수를 다 순열로 만들어서 sort하고 그 중 가장 큰 수를 리턴함
    //시간 초과로 다 틀린걸로 나옴ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
    public String sol1(int[] numbers) {

        if(Arrays.stream(numbers).allMatch(e -> e == 0)) {
            return "0";
        }

        int output[] = new int [numbers.length];
        boolean visited[] = new boolean [numbers.length];
        int n = numbers.length;

        perm(numbers, output, visited, 0, n, numbers.length);
//        System.out.println(list);
        Collections.sort(list);
        return list.get(list.size() - 1);

    }

    //numbers를 string배열에 담고 처리하니까, 테스트케이스는 모두 나오지만 틀린 것으로 나옴
    //반례라고 하는 11가지 케이스를 추가해봄....
    public String sol2(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];

        if(Arrays.stream(numbers).allMatch(e -> e == 0)) {
            return "0";
        }

        for(int i = 0 ; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        for(int i = 0 ; i < numbers.length ; i++) {
            arr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0 ; i < arr.length - 1 ; i++) {

            if(arr[i].startsWith(arr[i + 1]) &&
                    arr[i].length() != arr[i + 1].length()) {
                int ordered = Integer.parseInt(arr[i] + arr[i + 1]);
                int reversed = Integer.parseInt(arr[i + 1] + arr[i]);
                if(ordered < reversed) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }

        }

        for(int i = 0 ; i < arr.length ; i++) {
            answer += arr[i];
        }
        // System.out.println("answer = " + answer);
        return answer;
    }

    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];

        if(Arrays.stream(numbers).allMatch(e -> e == 0)) {
            return "0";
        }

        for(int i = 0 ; i < numbers.length ; i++) {
            arr[i] = Integer.toString(numbers[i]);
        }

        //Comparable : 객체간 일반적인 정렬이 필요할 때 compareTo() 가나다순서인지
        //Comparator : 객체간 특정한 정렬이 필요할 때 compare() 대소비교
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (Integer.parseInt(s2 + s1) - Integer.parseInt(s1 + s2));
            }
        });
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return (b + a).compareTo(a + b);
//            }
//        });


        for(int i = 0 ; i < arr.length - 1 ; i++) {

            if(arr[i].startsWith(arr[i + 1]) &&
                    arr[i].length() != arr[i + 1].length()) {
                int ordered = Integer.parseInt(arr[i] + arr[i + 1]);
                int reversed = Integer.parseInt(arr[i + 1] + arr[i]);
                if(ordered < reversed) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }

        }

        for(int i = 0 ; i < arr.length ; i++) {
            answer += arr[i];
        }
        // System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        BiggestNumber b = new BiggestNumber();
        b.solution(new int[]{6, 10, 2}); //"6210"
        b.solution(new int[]{3, 30, 34, 5, 9});//"9534330"
        b.solution(new int[]{0, 0, 0, 0});//
        b.solution(new int[]{152, 15});

    }
}
