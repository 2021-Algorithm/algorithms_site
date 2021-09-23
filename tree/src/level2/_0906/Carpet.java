package level2._0906;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        for(int i = 1 ; i <= yellow ; i++) {
            x = i;
            if(yellow % i == 0) {
                y = yellow / i;
                // System.out.println(x + " , " + y);

                if(brown - 4 == 2 * (x + y)) {
                    answer[0] = y + 2;
                    answer[1] = x + 2;
                    break;
                }
            }


        }
        // yellow = x * y;
        // yellow + brown = (x + 2) * (y + 2);
        // brown = 2x + 2y + 4;
        // brown - 4 = 2x + 2y;
        return answer;
    }
}
