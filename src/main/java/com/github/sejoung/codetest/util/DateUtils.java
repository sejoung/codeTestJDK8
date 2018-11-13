package com.github.sejoung.codetest.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private DateUtils(){
        throw new AssertionError();
    }

    public static String getCurrentDateTime(String pattern) {
        LocalDateTime time = LocalDateTime.now();
        return getFormatterDate(pattern, time);
    }

    public static String getFormatterDate(String pattern, LocalDateTime ldt) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(ldt);
    }

    public static String getCurrentDateTime() {
        LocalDateTime time = LocalDateTime.now();
        return time.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    public static String getCurrentDateTimeMinusDay(String pattern,long minusDay) {
        LocalDateTime time = LocalDateTime.now().minusDays(minusDay);
        return getFormatterDate(pattern, time);
    }
}
