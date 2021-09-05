package level1.level1_0805;

public class CaesarCipher {
    public String solution(String s, int n) {
        char[] charArr = new char[s.length()];

        for(int i = 0 ; i < s.length() ; i++) {
            charArr[i] = s.charAt(i);
        }

        for(int i = 0 ; i < charArr.length ; i++) {
            if((int)charArr[i] != 32) {
                //65~90
                if(64 < (int)charArr[i] && (int)charArr[i] < 91) {
                    charArr[i] += n;
                    if((int)charArr[i] > 90) {
                        charArr[i] -= 26;
                    }
                }
                //97~122
                if(96 < (int)charArr[i] && (int)charArr[i] < 123) {
                    charArr[i] += n;
                    System.out.print(charArr[i]);
                    if((int)charArr[i] > 122) {
                        charArr[i] -= 26;
                    }
                }
            }

        }

        StringBuilder sbf = new StringBuilder("");
        sbf.append(charArr);
        return sbf.toString();
    }
}
