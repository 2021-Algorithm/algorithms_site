package level1.lever1_0726;

import java.util.*;
import java.text.SimpleDateFormat;

public class Year2016 {
    public String sol1(int a, int b) {
        String answer = "";
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a - 1, b);
        Date date = cal.getTime();
        //E는 요일
        SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);

        answer = sdf.format(date).toUpperCase();

        return answer;
    }

    public String sol2(int month, int day) {
        Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, month - 1, day).build();
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }

    public String sol3(int a, int b) {
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }

        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;
    }

}
