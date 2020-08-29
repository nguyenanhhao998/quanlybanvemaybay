/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.ui;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HAO
 */
public class DateUtil {
    public static Date getTheBeginningOfNextMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.MONTH, 1);

        return calendar.getTime();
    }

    public static Date getTheBeginningOfCurrentMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

        return calendar.getTime();
    }

    public static Date getTheEndOfCurrentMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MINUTE, calendar.getActualMaximum(Calendar.MINUTE));
        calendar.set(Calendar.HOUR, 23);
        calendar.set(Calendar.SECOND, calendar.getActualMaximum(Calendar.SECOND));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        return calendar.getTime();

    }

    public static Date getTheBeginningOfCurrentYear(Integer year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MONTH, calendar.getActualMinimum(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

        return calendar.getTime();
    }

    public static Date getTheEndOfCurrentYear(Integer year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MINUTE, calendar.getActualMaximum(Calendar.MINUTE));
        calendar.set(Calendar.HOUR, 23);
        calendar.set(Calendar.SECOND, calendar.getActualMaximum(Calendar.SECOND));
        calendar.set(Calendar.MONTH, calendar.getActualMaximum(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        return calendar.getTime();

    }

    public static List<Date> getListDateStepByEachMonth(Date from, Date to) {
        List<Date> listDates = new ArrayList<>();
        Date curStart;
        curStart = DateUtil.getTheBeginningOfCurrentMonth(from);

        while (true) {
            if (curStart.compareTo(to) > 0) {
                break;
            }
            listDates.add(curStart);

            curStart = DateUtil.getTheBeginningOfNextMonth(curStart);
        }
        return listDates;
    }

    public static List<Date> getListDateStepByEachYear(int from, int to) {
        List<Date> listDates = new ArrayList<>();
        Date curStart;

        for (int i = from; i <= to; i++) {
            curStart = DateUtil.getTheBeginningOfCurrentYear(i);
            listDates.add(curStart);
        }

        return listDates;
    }
}
