package level1_0802;

public class SecretMap {
    public String[] sol(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] bin1Arr = new String[n];
        String[] bin2Arr = new String[n];
        for(int i = 0 ; i < n ; i++) {
            String temp = "";

            String bin1 = Integer.toBinaryString(arr1[i]);
            String bin2 = Integer.toBinaryString(arr2[i]);
            while(bin1.length() < n) {
                bin1 = "0" + bin1;
            }

            while(bin2.length() < n) {
                bin2 = "0" + bin2;
            }

            for(int j = 0 ; j < n ; j++) {
                bin1Arr = bin1.split("");
                bin2Arr = bin2.split("");
                if(bin1Arr[j].equals("1") || bin2Arr[j].equals("1")) {
                    temp += "#";
                }
                else if(bin1Arr[j].equals("0") && bin2Arr[j].equals("0")){
                    temp += " ";
                }
            }
            answer[i] = temp;
        }
        return answer;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String temp = "";
        String a;
        String b;
        int cnt;
        String zero = "0";
        for (int i = 0; i < n; i++) {
            a = Integer.toBinaryString(arr1[i]);
            b = Integer.toBinaryString(arr2[i]);
            if (b.length() != n) {
                cnt = b.length();
                b = zero.repeat(n - cnt) + b;
            }
            if (a.length() != n) {
                cnt = a.length();
                a = zero.repeat(n - cnt) + a;
            }
            for (int j = 0; j < n; j++) {

                String[] arrA = a.split("");
                String[] arrB = b.split("");
                if (arrA[j].equals("1") || arrB[j].equals("1")) {
                    temp = temp + "#";
                } else if (arrA[j].equals("0") && arrB[j].equals("0")) {
                    temp = temp + " ";
                }
                answer[i] = temp;
                if (temp.length() == n) {
                    temp = "";
                    break;
                }

            }
            System.out.println(a + "      " + b);

        }


        return answer;
    }
}
