package level1.study9;

public class EvenAndOdd {
    public static String solution(int num) {
        if (num % 2 == 0) return "Even";
        return "Odd";
    }

    public static String solution2(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(solution(num));
        System.out.println(solution2(num));
    }
}
