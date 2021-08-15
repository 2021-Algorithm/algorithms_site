package level1.level1_0715;

public class AddPlusMinus {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0 ; i < absolutes.length ; i++) {
            if(signs[i] == true) {
                answer += absolutes[i];
            }
            if(signs[i] == false) {
                answer -= absolutes[i];
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        AddPlusMinus a = new AddPlusMinus();
        a.solution(new int[]{4,7,12}, new boolean[]{true,false,true}); //9
        a.solution(new int[]{1,2,3}, new boolean[]{false,false,true}); //0
    }
}
