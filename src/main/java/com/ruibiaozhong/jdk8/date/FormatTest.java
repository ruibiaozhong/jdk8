package com.ruibiaozhong.jdk8.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class FormatTest {


    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, 3, 18);
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);


        LocalDate date1 = LocalDate.parse("20140318", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate date2 = LocalDate.parse("2014-03-18", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(date1);
        System.out.println(date2);


        System.out.println("-----------------------");
        DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("d.MMMM yyyy", Locale.ITALIAN);
        LocalDate date3 = LocalDate.of(2014, 3, 18);
        String formattedDate = date3.format(italianFormatter);
        System.out.println(formattedDate);

        LocalDate date4 = LocalDate.parse(formattedDate, italianFormatter);
        System.out.println(date4);


        System.out.println("------------------------");
        DateTimeFormatter italianFormatter2 = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(".")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(".")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive().toFormatter(Locale.JAPANESE);

        String formattedDate2 = date3.format(italianFormatter2);
        System.out.println(formattedDate2);













    }



}
