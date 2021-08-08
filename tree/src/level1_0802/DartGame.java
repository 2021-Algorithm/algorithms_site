package level1_0802;

import java.util.ArrayList;
import java.util.List;

public class DartGame {

    public int sol(String dartResult) {
        List<Integer> list = new ArrayList<>();

        dartResult = dartResult.replaceAll("[*]|#", "$0 ")
                .replaceAll("\\dD|\\dS|\\dT", "$0 ");
        String[] splitArr = dartResult.split(" ");

        for (int i = 0; i < splitArr.length; i++) {

            if (splitArr[i].matches("(.*)S")) {
                splitArr[i] = splitArr[i].replace("S", "");
                list.add((int) Math.pow(Integer.parseInt(splitArr[i]), 1));

            } else if (splitArr[i].matches("(.*)D")) {
                splitArr[i] = splitArr[i].replace("D", "");
                list.add((int) Math.pow(Integer.parseInt(splitArr[i]), 2));

            } else if (splitArr[i].matches("(.*)T")) {
                splitArr[i] = splitArr[i].replace("T", "");
                list.add((int) Math.pow(Integer.parseInt(splitArr[i]), 3));
            }
        }

        for (int i = 1; i < splitArr.length; i++) {
            if (splitArr[i].equals("*")) {
                if (i == 1) {
                    list.set(0, list.get(0) * 2);
                } else if (i == 2) {
                    list.set(0, list.get(0) * 2);
                    list.set(1, list.get(1) * 2);
                } else if (i == 3 && splitArr[1].matches("[*]|#")) {
                    list.set(0, list.get(0) * 2);
                    list.set(1, list.get(1) * 2);
                } else if (i == 3 && !splitArr[1].matches("[*]|#")) {
                    list.set(1, list.get(1) * 2);
                    list.set(2, list.get(2) * 2);
                } else {
                    list.set(1, list.get(1) * 2);
                    list.set(2, list.get(2) * 2);
                }
            }

            else if (splitArr[i].equals("#")) {
                if (i == 1) {
                    list.set(0, list.get(0) * -1);
                } else if (i == 2 || i == 3 && splitArr[1].matches("[*]|#")) {

                    list.set(1, list.get(1) * -1);
                } else {
                    list.set(2, list.get(2) * -1);
                }
            }
        }

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        return result;
    }

    public int solution(String dartResult) {
        int answer = 0;
        int[] tempArr = new int[3];
        int tempIndex = 0;
        String[] arr = dartResult.split("");
        for (int i = 1; i < arr.length; i++) {

            if (arr[i].equals("0") && arr[i - 1].equals("1")) arr[i] = "10";
            if (arr[i].equals("S")) {
                tempArr[tempIndex] = (int) Math.pow(Integer.parseInt(arr[i - 1]), 1);
                tempIndex++;

            } else if (arr[i].equals("D")) {
                tempArr[tempIndex] = (int) Math.pow(Integer.parseInt(arr[i - 1]), 2);
                tempIndex++;

            } else if (arr[i].equals("T")) {
                tempArr[tempIndex] = (int) Math.pow(Integer.parseInt(arr[i - 1]), 3);
                tempIndex++;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("#")) {
                if (i == 2) tempArr[0] = tempArr[0] * (-1);
                if (i == 4 || i == 5) tempArr[1] = tempArr[1] * (-1);
                if (i == 6 || i == 7 || i == 8) tempArr[2] = tempArr[2] * (-1);
            }
            if (arr[i].equals("*")) {
                if (i == 2) tempArr[0] = tempArr[0] * 2;
                if (i == 4 || i == 5) {
                    tempArr[1] = tempArr[1] * 2;
                    tempArr[0] = tempArr[0] * 2;
                }
                if (i == 6 || i == 7 || i == 8) {
                    tempArr[2] = tempArr[2] * 2;
                    tempArr[1] = tempArr[1] * 2;
                }
            }
        }

        for (int i = 0; i < tempArr.length; i++) {
            answer = answer + tempArr[i];
        }
        return answer;
    }
}
