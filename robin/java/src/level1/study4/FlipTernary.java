package level1.study4;

public class FlipTernary {
    public static int solution(int n) {
        String ternary = "";

        while (n != 0) {
            int remainder = n % 3;
            n = n / 3;
            ternary += remainder;
        }

        return Integer.parseInt(ternary, 3);
    }

    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));
    }
}
