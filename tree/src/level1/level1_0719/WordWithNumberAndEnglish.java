package level1.level1_0719;

public class WordWithNumberAndEnglish {
    public int solution(String s) {
        int answer = 0;

        String[] stringNums = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0 ; i < stringNums.length ; i++) {
            if(s.contains(stringNums[i])) {
                s = s.replace(stringNums[i], Integer.toString(i));
            }
        }
        answer = Integer.parseInt(s);

        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        WordWithNumberAndEnglish w = new WordWithNumberAndEnglish();
        w.solution("one4seveneight"); //1478
        w.solution("23four5six7"); //234567
        w.solution("2three45sixseven"); //234567
        w.solution("123"); //123
    }

}
