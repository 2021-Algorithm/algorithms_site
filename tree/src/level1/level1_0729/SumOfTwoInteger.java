package level1.level1_0729;

public class SumOfTwoInteger {
    public long sol1(int a, int b) {
        long answer = 0;
        if(a == b) {
            answer = a;
        }
        else if(a < b) {
            for(int i = a; i <= b ; i++) {
                answer += i;
            }
        }
        else {
            for(int i = b ; i <= a ; i++) {
                answer += i;
            }
        }
        return answer;
    }

    public long oldSol(int a, int b) {
        long answer = 0;

        if(a >= b){
            for(int i=b;i<=a;i++){
                answer = answer + i;
            }

        }else{
            for(int i=a;i<=b;i++){
                answer = answer + i;
            }
        }


        return answer;
    }
}
