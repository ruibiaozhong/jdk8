package com.ruibiaozhong.jdk8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalTimeTest {


    public static void main(String[] args) {
//        LocalTime localTime = LocalTime.of(13, 45, 20);
//        int hour = localTime.getHour();
//        int minute = localTime.getMinute();
//        int second = localTime.getSecond();
//        System.out.println(hour + " " + minute + " " + second);

        LocalDate date = LocalDate.parse("2014-03-18");
        LocalTime time = LocalTime.parse("13:45:20");
//        System.out.println(date);
//        System.out.println(time);

        LocalDateTime dt1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
        LocalDateTime dt2 = LocalDateTime.of(date, time);
        LocalDateTime dt3 = date.atTime(13, 45, 20);
        LocalDateTime dt4 = date.atTime(time);
        LocalDateTime dt5 = time.atDate(date);

        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);
        System.out.println(dt4);
        System.out.println(dt5);


        LocalDate date1 = dt1.toLocalDate();
        LocalTime date2 = dt1.toLocalTime();
        System.out.println(date1);
        System.out.println(date2);









    }



}
