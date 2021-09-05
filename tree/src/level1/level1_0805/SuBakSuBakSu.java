package level1.level1_0805;

public class SuBakSuBakSu {

    public String dokdokSol(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= n ; i++) {
            sb.append(i % 2 == 1 ? "수" : "박");
        }
        return sb.toString();
    }

    public String solution(int n) {
        String answer = "";
        for(int i = 1 ; i <= n ; i++) {
            answer += i % 2 == 1 ? "수" : "박";
        }
        return answer;
    }

    public String oldSol(int n) {
        String answer = "";
        for (int x = 0; x < n; x++) {
            if (x % 2 == 0) {
                answer = answer + "수";
            } else {
                answer = answer + "박";
            }
        }
        return answer;
    }
}
