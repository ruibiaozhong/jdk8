package com.ruibiaozhong.jdk8.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DurationTest {


    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(15, 47 );
        LocalTime localTime2 = LocalTime.of(15, 48 );
        Duration d1 = Duration.between(localTime1, localTime2);
        System.out.println(d1);

        LocalDateTime localDateTime1 = LocalDateTime.of(2019, 4, 7, 10, 20, 30);
        LocalDateTime localDateTime2 = LocalDateTime.of(2019, 3, 7, 9, 10, 39);

        Duration d2 = Duration.between(localDateTime1, localDateTime2);
        System.out.println(d2);

        Instant instant1 = Instant.ofEpochSecond(4);
        Instant instant2 = Instant.ofEpochSecond(5);
        Duration d3 = Duration.between(instant1, instant2);
        System.out.println(d3);

        System.out.println("----------------------------------");
        Duration threeMinutes = Duration.ofMinutes(3);
        Duration threeMinutes2 = Duration.of(3, ChronoUnit.MINUTES);

        System.out.println(threeMinutes);
        System.out.println(threeMinutes2);











    }


}
