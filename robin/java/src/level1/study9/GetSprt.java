package level1.study9;

public class GetSprt {

    public static long solution(long n) {
        Double num = Math.sqrt(n);

        if( num % 1 == 0){
            return (long) Math.pow(num + 1, 2);
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println(solution(n));
    }
}
