package free.fgq.demo.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    /**
     * 获取年份
     * @param date
     * @param addYear + 年
     * @return
     */
    public static int getYear(Date date, int addYear) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, addYear);
        int year = calendar.get(Calendar.YEAR);
        return year;
    }
}
