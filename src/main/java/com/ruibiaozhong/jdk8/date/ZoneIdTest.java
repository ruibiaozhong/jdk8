package com.ruibiaozhong.jdk8.date;

import java.time.*;
import java.util.TimeZone;

public class ZoneIdTest {


    public static void main(String[] args) {
        ZoneId romeZone = ZoneId.of("Europe/Rome");

        System.out.println(romeZone);


        ZoneId defaultZoneId = TimeZone.getDefault().toZoneId();
        System.out.println(defaultZoneId);

        System.out.println("----------------------------------");
        LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
        ZonedDateTime zdt1 = date.atStartOfDay(romeZone);

        System.out.println(zdt1);

        System.out.println("------------------------------------");
        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 18, 13, 45);
        ZonedDateTime zdt2 = dateTime.atZone(romeZone);
        System.out.println(zdt2);

        System.out.println("-----------------------------------");

        Instant instant = Instant.now();
        ZonedDateTime zdt3 = instant.atZone(romeZone);
        System.out.println(zdt3);
        System.out.println("-------------------------------");


        LocalDateTime dateTime1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
        Instant instantFromDateTime = dateTime1.atZone(romeZone).toInstant();
        System.out.println(instantFromDateTime);

        System.out.println("--------------------");

        Instant instant1 = Instant.now();
        LocalDateTime timeFromInstant = LocalDateTime.ofInstant(instant1, romeZone);
        System.out.println(timeFromInstant);

        System.out.println("-------------------------------");


        ZoneOffset newYorkOffset = ZoneOffset.of("-05:00");
        LocalDateTime localDateTime = LocalDateTime.now();
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, newYorkOffset);
        System.out.println(offsetDateTime);











    }














}
