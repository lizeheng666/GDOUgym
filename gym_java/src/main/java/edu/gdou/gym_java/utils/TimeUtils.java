package edu.gdou.gym_java.utils;

import lombok.val;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeUtils {

    public static Timestamp StringToTimeStamp(String time) {
        return Timestamp.valueOf(time);
    }

    public static String TimeStampToString(Timestamp timestamp) {
        val simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(timestamp);
    }

    public static String TimeStampToString(String pattern, Timestamp timestamp) {
        val simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(timestamp);
    }

    public static Timestamp nowToTimeStamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static String nowToString(String pattern) {
        return TimeStampToString(pattern, nowToTimeStamp());
    }

    public static String nowToString() {
        return TimeStampToString(nowToTimeStamp());
    }

    public static Date nowToDate(){
        return new Date(System.currentTimeMillis());
    }

    public static Timestamp DateToTimeStamp(Date date) {
        return new Timestamp(date.getTime());
    }

    public static Date TimeStampToDate(Timestamp timestamp) {
        return new Date(timestamp.getTime());
    }

    //相隔天数
    public static int getDayDiffer(Date startDate, Date endDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long startDateTime = dateFormat.parse(dateFormat.format(startDate)).getTime();
        long endDateTime = dateFormat.parse(dateFormat.format(endDate)).getTime();
        return (int) ((endDateTime - startDateTime) / (1000 * 3600 * 24));
    }

}
