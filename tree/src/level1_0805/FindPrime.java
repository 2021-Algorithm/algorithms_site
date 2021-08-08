package level1_0805;

public class FindPrime {
    //에라토스테네스의 체
    public int solution(int num) {
        int answer = 0;
        boolean[] arr = new boolean[num + 1];    //true 이면 해당 인덱스 소수.
        arr[0] = arr[1] = false;
        for (int i = 2; i <= num; i++) {
            arr[i] = true;
        }

        //2 부터 숫자를 키워가며 배수들을 제외(false 할당)
        for (int i = 2; i * i <= num; i += 1) {
            for (int j = i * i; j <= num; j += i) {
                arr[j] = false;        //2를 제외한 2의 배수 false
            }
        }
        for (int i = 0; i <= num; i += 1) {
            if (true == arr[i]) {
                answer += 1;
            }
        }
        return answer;
    }

}
