package level1_0715;

import java.util.ArrayList;
import java.util.List;

public class NewIdRecommendation {
    public String solution(String new_id) {
        String answer = "";
        List<Character> charList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        //1단계 소문자로 치환
        for(int j = 0 ; j < new_id.length() ; j++) {
            charList.add(Character.toLowerCase(new_id.charAt(j)));
        }

        //2단계 소문자, 숫자, -, _, . 제외한 모든 문자 제거
        //소문자, 숫자, -, _, .에 해당하면 strList에 추가
        for(int i = 0 ; i < charList.size() ; i++) {
            int ascii = (int)charList.get(i);

            if(ascii == 45 || ascii == 46 || ascii == 95) {
                strList.add(Character.toString(charList.get(i)));
            }else if(ascii >= 97 && ascii <= 122) {
                strList.add(Character.toString(charList.get(i)));
            }else if(ascii >= 48 && ascii <= 57) {
                strList.add(Character.toString(charList.get(i)));
            }
        }

        //3단계 : .가 2번 이상 연속된 부분은 하나의 .로 치환
        for(int x = strList.size() - 1; x > 0; x--) {
            if(strList.get(x).equals(strList.get(x - 1)) && strList.get(x).equals(".")) {
                strList.remove(x);
            }
        }

        //4단계 : .가 처음이나 끝에 위치한다면 제거
        if(strList.get(0).equals(".")) {
            strList.remove(0);
        }
        else if(strList.get(strList.size() - 1).equals(".")) {
            strList.remove(strList.size() - 1);
        }

        //5단계 : 빈 문자열이라면, a대입
        if(strList.size() == 0) {
            strList.add("a");
        }

        //6단계 : 길이가 16자 이상이면, 첫 15문자 제외한 나머지 내용 제거
        //제거 후 15번째에 .가 위치한다면 끝의 마침표는 제거
        for(int i = strList.size() - 1 ; i > 0 ; i--) {
            if(i >= 15) {
                strList.remove(i);
            }
        }
        if(strList.get(strList.size() - 1).equals(".")) {
            strList.remove(strList.size() - 1);
        }

        //7단계 : 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 붙임
        for(int i = 0 ; i < strList.size() ; i++) {
            if(strList.size() < 3) {
                strList.add(strList.get(strList.size() - 1));
            }
        }

        for(int i = 0 ; i < strList.size() ; i++) {
            answer += strList.get(i);
        }

        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        NewIdRecommendation n = new NewIdRecommendation();
        n.solution("...!@BaT#*..y.abcdefghijklm"); //"bat.y.abcdefghi"
        n.solution("z-+.^."); //"z--"
        n.solution("=.="); //"aaa"
        n.solution("123_.def"); //"123_.def"
        n.solution("abcdefghijklmn.p"); //"abcdefghijklmn"
    }
}
