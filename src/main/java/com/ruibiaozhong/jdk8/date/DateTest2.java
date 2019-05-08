package com.ruibiaozhong.jdk8.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DateTest2 {


    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2014, 3, 18);
//        int year = date.getYear();
//        Month month = date.getMonth();
//        int day = date.getDayOfMonth();
//        DayOfWeek dow = date.getDayOfWeek();
//        int len = date.lengthOfMonth();
//        boolean leap = date.isLeapYear();
//
//
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);
//        System.out.println(dow);
//        System.out.println(len);
//        System.out.println(leap);
//
//        LocalDate today = LocalDate.now();
//        System.out.println(today);


        int year = date.get(ChronoField.YEAR);
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        int day = date.get(ChronoField.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);



    }




}
