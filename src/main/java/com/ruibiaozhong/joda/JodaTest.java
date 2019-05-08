package com.ruibiaozhong.joda;

import org.joda.time.*;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class JodaTest {


    public static void main(String[] args) {
        Date juDate = new Date();
        DateTime dt = new DateTime(juDate);
        System.out.println(dt);

        System.out.println("----------------------");

        DateTime dt1 = new DateTime();
        int month = dt1.getMonthOfYear();
        int year = dt1.getYear();

        System.out.println(year + "  " + month);


        System.out.println("----------------------");

        DateTime dt2 = new DateTime();
        DateTime year2000 = dt2.withYear(2000);
        DateTime twoHourLater = dt2.plusHours(2);

        System.out.println(dt2);
        System.out.println(year2000);
        System.out.println(twoHourLater);

        System.out.println("------------------------");


        DateTime dt3 = new DateTime();
        String monthName = dt3.monthOfYear().getName();
        String frenchShortName = dt3.monthOfYear().getAsShortText(Locale.FRENCH);
        boolean isLeapYear = dt3.year().isLeap();
        DateTime rounded = dt3.dayOfMonth().roundFloorCopy();

        System.out.println(monthName);
        System.out.println(frenchShortName);
        System.out.println(isLeapYear);
        System.out.println(rounded);


        System.out.println("-----------------------------");

        Chronology coptic = CopticChronology.getInstance();
        System.out.println(coptic);

        System.out.println("------------------------------");

        DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        Chronology gregorianJuian = GJChronology.getInstance(zone);

        System.out.println(gregorianJuian);

        System.out.println("-----------------------------");


        DateTime dt5 = new DateTime(2005, 3, 26, 12, 0, 0, 0);
        DateTime plusPeriod = dt5.plus(Period.days(1));
        DateTime plusDuration = dt5.plus(new Duration(24L * 60L * 60L * 1000L));
        System.out.println(plusPeriod);
        System.out.println(plusDuration);












    }












}
