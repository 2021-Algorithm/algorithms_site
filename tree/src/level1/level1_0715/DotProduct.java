package level1.level1_0715;

public class DotProduct {

    public int solution(int[] a, int[] b) {
        int temp = 0;
        int answer = 0;
        for(int i = 0 ; i < a.length; i++) {
            temp = a[i] * b[i];
            answer += temp;
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        DotProduct d = new DotProduct();
        d.solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2}); //3
        d.solution(new int[]{-1,0,1}, new int[]{1,0,-1}); //-2
    }
}
