package level1_0729;

import java.util.regex.Pattern;

public class BasicProcessString {
    public boolean solution(String s) {

        //길이가 4이거나 6 이외는 False 처리해주어야합니다.
        if(s.length() == 4 || s.length() == 6){
            String pattern = "^[0-9]*$"; //숫자만
            return Pattern.matches(pattern, s);
        }
        else {
            return false;
        }
    }
}
