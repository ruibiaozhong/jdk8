package com.ruibiaozhong.jdk8.date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTest2 {


    public static void main(String[] args) {


        LocalDate date1 = LocalDate.of(2014, 3, 18);
        LocalDate date2 = date1.withYear(2011);
        LocalDate date3 = date2.withDayOfMonth(25);
        LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 9);


        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);

        System.out.println("----------------------");


        LocalDate localDate5 = LocalDate.of(2014, 3, 18);
        LocalDate localDate6 = localDate5.plusWeeks(1);
        LocalDate localDate7 = localDate6.minusYears(3);
        LocalDate localDate8 = localDate7.plus(6, ChronoUnit.MONTHS);

        System.out.println(localDate5);
        System.out.println(localDate6);
        System.out.println(localDate7);
        System.out.println(localDate8);

        System.out.println("------------------------------");


        LocalDate date = LocalDate.of(2014, 3, 18);
        date = date.with(ChronoField.MONTH_OF_YEAR, 9);
        date = date.plusYears(2).minusDays(10);
        date.withYear(2011);

        System.out.println(date);










    }




}
