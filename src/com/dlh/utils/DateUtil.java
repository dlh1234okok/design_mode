package com.dlh.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: dulihong
 * @date: 2019/2/18 13:27
 */
public class DateUtil {

    private static ThreadLocal<SimpleDateFormat> threadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    public static Date parse(String date) {
        try {
            return threadLocal.get().parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String format(Date date) {
        return threadLocal.get().format(date);
    }
}
