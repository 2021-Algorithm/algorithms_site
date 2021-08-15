package level1.level1_0719;

public class MakePrime {
    int result = 0 ;
    public int solution(int[] nums) {
        return comb1(nums, new boolean[nums.length], 0, 3);
    }

    int comb1(int[] arr, boolean[] visited, int start, int r) {
        int sum = 0 ;
        if(r == 0) {
            for(int i = 0; i < arr.length; i++) {
                if(visited[i] == true) {
                    sum += arr[i];
                }
            }
            if(isPrime(sum)) {
                result += 1;
            }
        }
        else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
        return result;
    }

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

}
