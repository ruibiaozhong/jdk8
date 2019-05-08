package com.ruibiaozhong.jdk8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ZoneTest {


    public static void main(String[] args) {
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println(defaultZone);

        ZoneId america = ZoneId.of("America/New_York");
        LocalDateTime shanghaiTime = LocalDateTime.now();

        LocalDateTime americaLocalTime = LocalDateTime.now(america);
        System.out.println(shanghaiTime);
        System.out.println(americaLocalTime);


    }


}


