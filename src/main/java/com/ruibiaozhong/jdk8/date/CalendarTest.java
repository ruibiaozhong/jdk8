package com.ruibiaozhong.jdk8.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistDate;
import java.util.Locale;

public class CalendarTest {


    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
        JapaneseDate japaneseDate = JapaneseDate.from(date);

        System.out.println(japaneseDate);

        System.out.println("---------------------------");

        ThaiBuddhistDate thaiBuddhistDate = ThaiBuddhistDate.from(date);
        System.out.println(thaiBuddhistDate);

        System.out.println("---------------------------");

        Chronology chronology = Chronology.ofLocale(Locale.TRADITIONAL_CHINESE);
        ChronoLocalDate chronoLocalDate = chronology.dateNow();
        System.out.println(chronoLocalDate);




    }








}
