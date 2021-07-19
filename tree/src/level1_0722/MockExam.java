package level1_0722;

import java.util.*;

class MockExam {

    public int[] solution(int[] answers) {
        int[] first = new int[]{1, 2, 3, 4, 5}; //5
        int[] second = new int[]{2, 1, 2, 3, 2, 4, 2, 5}; //8
        int[] third = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
        int firstScore = 0, secondScore = 0 ,thirdScore = 0;

        for(int i = 0 ; i < answers.length ; i++) {
            if(answers[i] == first[i % 5]) {
                firstScore++;
            }
            if(answers[i] == second[i % 8]) {
                secondScore++;
            }
            if(answers[i] == third[i % 10]) {
                thirdScore++;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, firstScore);
        map.put(2, secondScore);
        map.put(3, thirdScore);

        int max = firstScore;

        if (secondScore > max) {
            max = secondScore;
        }if (thirdScore > max) {
            max = thirdScore;
        }

        List<Integer> list = new ArrayList<>();

        for(int key : map.keySet()) {
            if(max == map.get(key)) {
                list.add(key);
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0 ; i < list.size() ; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    //예전에 풀었던 풀이인데 저도 모르겟다는.....
    public int[] sol1(int[] answers) {
        int[] answer = {};

        ArrayList<Integer> numbers = new ArrayList<>();

        int p1Point = 0;
        int p2Point = 0;
        int p3Point = 0;
        int number = 0;

        int[] test = new int[3];

        int[] p1 = new int[10000];
        int[] p2 = new int[10000];
        int[] p3 = new int[10000];

        for(int y=0;y<10000;y++){
            if(y % 5 == 0){
                p1[y] = 1;
            }else if(y % 5 == 1){
                p1[y] = 2;
            }else if(y % 5 == 2){
                p1[y] = 3;
            }else if(y % 5 == 3){
                p1[y] = 4;
            }else if(y % 5 == 4){
                p1[y] = 5;
            }
        }
        for(int i=0;i<10000;i++){
            if(i % 8 == 0 || i % 8 == 2 || i % 8 == 4 || i % 8 == 6){
                p2[i] = 2;
            }else if(i % 8 == 1){
                p2[i] = 1;
            }else if(i % 8 == 3){
                p2[i] = 3;
            }else if(i % 8 == 5){
                p2[i] = 4;
            }else if(i % 8 == 7){
                p2[i] = 5;
            }
        }

        for(int j=0;j<10000;j++){
            if(j % 10 == 0 || j % 10 == 1){
                p3[j] = 3;
            }else if(j % 10 == 2 || j % 10 == 3){
                p3[j] = 1;
            }else if(j % 10 == 4 || j % 10 == 5){
                p3[j] = 2;
            }else if(j % 10 == 6 || j % 10 == 7){
                p3[j] = 4;
            }else if(j % 10 == 8 || j % 10 == 9){
                p3[j] = 5;
            }
        }


        for(int x=0;x<answers.length;x++){
            if(answers[x] == p1[x]){
                p1Point++;
            }if(answers[x] == p2[x]){
                p2Point++;
            }if(answers[x] == p3[x]){
                p3Point++;
            }
        }

        test[0] = p1Point;
        test[1] = p2Point;
        test[2] = p3Point;


        if(p1Point >= p2Point && p1Point >= p3Point){
            number = p1Point;
        }else if(p2Point >= p1Point && p2Point >= p3Point){
            number =  p2Point;
        }else if(p3Point >= p1Point && p3Point >= p2Point){
            number =  p3Point;
        }

        int maxIndex = 0;
        for(int i=1;i<test.length;i++){
            if(test[i] > test[maxIndex]){
                maxIndex = i;
            }

        }
        for(int i=0;i<test.length;i++){
            if(test[i] == test[maxIndex]){
                numbers.add(i);
            }
        }

        Collections.sort(numbers);
        answer = new int[numbers.size()];
        for(int i=0;i<numbers.size();i++){
            answer[i] = numbers.get(i)+1;
        }

        return answer;
    }

    public int[] sol2(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }


}
