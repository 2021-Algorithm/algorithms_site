package level1.level1_0719;

public class Combination {
    public static void main(String[] args) {
        int[] arr = {1,2,7,6,4}; //조합을 만들 배열
        boolean[] visited = new boolean[arr.length];

        //1. 백트래킹을 이용해 구현
        System.out.println("-------- 1. 백트래킹 ---------");


        comb1(arr, visited, 0, 3);
//        for(int r = 1; r <= arr.length; r++) {
//            System.out.println("\n" + arr.length + "개 중에 " + r  + "개 뽑음");
//            comb1(arr, visited, 0, r);
//        }

        //2. 재귀를 이용해 구현
        System.out.println("\n---------- 2. 재귀 ----------");

//        for(int r = 1; r <= arr.length ; r++) {
//            System.out.println("\n" + arr.length + "개 중에 " + r  + "개 뽑음");
//            comb2(arr, visited, 0, r);
//        }
    }

    public static boolean isPrime(int n)
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

    static int result = 0;
    //1. 백트래킹을 이용해 구현
    static int comb1(int[] arr, boolean[] visited, int start, int r) {
        int sum = 0 ;
        //int result = 0;

        if(r == 0) {
            for(int i = 0; i < arr.length; i++) {
                if(visited[i] == true) {
                    sum += arr[i];
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("sum : " + sum);
            if(isPrime(sum)) {
                result += 1;
            }
            System.out.println("result = " + result);
            System.out.println();
//            return result;
        }
        else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }

       // System.out.println("result = " + result);
        return result;
    }

    static void print(int[] arr, boolean[] visited) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true) {
                sum += arr[i];
                System.out.print(arr[i] + " ");
            }
            System.out.println("sum : " + sum);
        }
        System.out.println();
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



}

