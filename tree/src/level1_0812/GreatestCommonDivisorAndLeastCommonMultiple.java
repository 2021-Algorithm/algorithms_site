package level1_0812;

public class GreatestCommonDivisorAndLeastCommonMultiple {
    public int gcd(int i, int j) {
        if (j == 0) {
            System.out.println("i = " + i);
            return i;
        }
        else {
            System.out.println("j = " + j);
            System.out.println("(i % j) = " + (i % j));
            return gcd(j, i % j);
        }
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int gcd = gcd(n, m);
        int lcm = n * m / gcd;

        answer[0] = gcd;
        answer[1] = lcm;

        return answer;
    }

    public static void main(String[] args) {
        GreatestCommonDivisorAndLeastCommonMultiple g = new GreatestCommonDivisorAndLeastCommonMultiple();
        g.solution(3, 12);
       // g.solution(2, 5);
    }
}
