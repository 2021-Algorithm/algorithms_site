package level1.study5;

public class CountPY {
    public static boolean solution(String s) {

        String lowerS = s.toLowerCase();
        char[] arrayS = lowerS.toCharArray();

        int countP = 0;
        int countY = 0;
        for (int i = 0; i < arrayS.length; i++) {
            if (arrayS[i] == 'p') countP += 1;
            if (arrayS[i] == 'y') countY += 1;
        }

        if (countP != countY) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));
    }
}
