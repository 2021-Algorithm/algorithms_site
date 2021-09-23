package level2._0906;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPrime {
    List<String> list = new ArrayList<>();
    Set<Integer> intSet = new HashSet<>();


    public boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public void perm(String[] arr, String[] output, boolean[] visited, int depth, int n, int r) {
        String temp = "";
        if (depth == r) {
            for(int i = 0 ; i < r; i++) {
                temp = temp + output[i];
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
                visited[i] = false;
            }
        }
    }

    public int solution(String numbers) {
        int answer = 0;
        // List<Integer> list = new ArrayList<>();
        String[] arr = numbers.split("");
        String[] output = new String [arr.length];
        boolean[] visited = new boolean [arr.length];
        for(int i = 1 ; i <= arr.length ; i++) {
            perm(arr, output, visited, 0, arr.length, i);
        }


        for(int i = 0 ; i < list.size() ; i++) {
            intSet.add(Integer.parseInt(list.get(i)));
        }
        System.out.println("---------------");

        // for(int i = 0 ; i < intSet.size() ; i++) {
        //     System.out.println(intSet.get(i));
        // }
        intSet.forEach(System.out::println);

//        for(int i = 0 ; i < set.size() ; i++) {
//            if(isPrime())
//        }
        long an = intSet.stream().filter(i -> isPrime(i)).count();

        return answer;
    }

    public static void main(String[] args) {

    }

}
