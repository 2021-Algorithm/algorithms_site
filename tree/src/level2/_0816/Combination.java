package level2._0816;


import java.util.ArrayList;
import java.util.List;

public class Combination {
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; //조합을 만들 배열
        boolean[] visited = new boolean[arr.length];

        //1. 백트래킹을 이용해 구현
        System.out.println("-------- 1. 백트래킹 ---------");
         list = new ArrayList<>();
        for(int r = 1; r <= arr.length; r++) {
            System.out.println("\n" + arr.length + "개 중에 " + r  + "개 뽑음");
            comb1(arr, visited, 0, r);
            System.out.println("list.size() = " + list.size());
    
        }

        
        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }

        //2. 재귀를 이용해 구현
//        System.out.println("\n---------- 2. 재귀 ----------");
//
//        for(int r = 1; r <= arr.length ; r++) {
//            System.out.println("\n" + arr.length + "개 중에 " + r  + "개 뽑음");
//            comb2(arr, visited, 0, r);
//        }
    }

    //1. 백트래킹을 이용해 구현
    public static void comb1(int[] arr, boolean[] visited, int start, int r) {
        List<Integer> sumList = new ArrayList<>();
        if(r == 0) {
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                if(visited[i] == true) {
                    sum += arr[i];
                }
            }
            System.out.println("sum = " + sum);
            list.add(sum);
            sum = 0;
            //print(arr, visited);
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }

    //2. 재귀를 이용해 구현
    static void comb2(int[] arr, boolean[] visited, int depth, int r) {
        if(r == 0) {
            print(arr, visited);
            return;
        }
        if(depth == arr.length) {
            return;
        } else {
            visited[depth] = true;
            comb2(arr, visited, depth + 1, r - 1);

            visited[depth] = false;
            comb2(arr, visited, depth + 1, r);
        }
    }

    // 배열 출력
    static void print(int[] arr, boolean[] visited) {
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 리스트에 담기
    static void addList(int[] arr, boolean[] visited) {
        List<Integer> sumList = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true) {
                sum += arr[i];
            }
        }
        sumList.add(sum);
        sum = 0;
    }

}
