package programmers.level1.study8;

import java.util.Scanner;

public class RectangleStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(("*".repeat(a) + "\n").repeat(b));
    }
}
