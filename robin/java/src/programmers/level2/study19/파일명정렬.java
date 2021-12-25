package programmers.level2.study19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 파일명정렬 implements Comparable<파일명정렬> {

    private String head;
    private String number;
    private String tail;

    public 파일명정렬() {

    }

    public 파일명정렬(String head, String number, String tail) {
        this.head = head;
        this.number = number;
        this.tail = tail;
    }

    @Override
    public int compareTo(파일명정렬 o) {

        // 대소문자 안가림.
        if(!this.head.equalsIgnoreCase(o.head)){
            return this.head.compareToIgnoreCase(o.head);
        }

        return Integer.compare(Integer.parseInt(this.number), Integer.parseInt(o.number));


        /* //testCase 6789틀림 80점 ㅜㅜ
        if (this.head.toLowerCase().charAt(0) == o.head.toLowerCase().charAt(0)) {

            if (Integer.parseInt(this.number) == Integer.parseInt(o.number)) {
                return 0;

            }
            return Integer.parseInt(this.number) - Integer.parseInt(o.number);
        }
        return this.head.toLowerCase().compareTo(o.head.toLowerCase());
         */
    }

    @Override
    public String toString() {
        return head + number + tail;
    }

    private 파일명정렬 splitFileName(String file) {
        String head = "";
        String number = "";
        String tail = "";

        String[] splitStr = file.split("[0-9]");
        System.out.println(splitStr);
        head = splitStr[0];

        String str = file.substring(head.length());


        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);

            if (i > 4 && Character.isDigit(c)) {
                number = str.substring(0, 5);
                tail = str.substring(5);
                break;

            } else if (!Character.isDigit(c)) {
                number = str.substring(0, i);
                tail = str.substring(i);
                break;

            } else { //IMG02 경우 때문에 만들어줌
                number = str;
            }
        }

        System.out.println("str = " + str);
        System.out.println("head = " + head);
        System.out.println("number = " + number);
        System.out.println("tail = " + tail);

        return new 파일명정렬(head, number, tail);
    }


    public String[] solution(String[] files) {

        ArrayList<파일명정렬> arrayList = new ArrayList();

        for (int i = 0; i < files.length; i++) {
            파일명정렬 file = splitFileName(files[i]);
            arrayList.add(file);
        }

        Collections.sort(arrayList);
        String[] answer = new String[files.length];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i).toString();
        }
        return answer;
    }

    public static void main(String[] args) {
        파일명정렬 파일명정렬 = new 파일명정렬();

        String[] files = {"foo123456.zip"};
        System.out.println(Arrays.toString(파일명정렬.solution(files)));
    }


}
