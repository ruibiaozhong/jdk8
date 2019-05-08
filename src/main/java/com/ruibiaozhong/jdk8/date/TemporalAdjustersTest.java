package com.ruibiaozhong.jdk8.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;

public class TemporalAdjustersTest {


    public static void main(String[] args) {


        LocalDate date1 = LocalDate.of(2018, 3, 18);
        LocalDate date2 = date1.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        LocalDate date3 = date2.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);



        LocalDate date4 = date1.with(temporal -> {
            System.out.println("-----------------");
            System.out.println(temporal);
            temporal = temporal.with(ChronoField.MONTH_OF_YEAR, 10);
            return temporal;
        });

        System.out.println(date4);


        System.out.println("------------------------");


        LocalDate date5 = LocalDate.of(2019, 5, 10);

        LocalDate date6 = date5.with(new NextWorkingDay());
        System.out.println(date6);


    }


}
