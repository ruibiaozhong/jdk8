package com.ruibiaozhong.jdk8.date;

import java.time.Instant;

public class InstantTest {


    public static void main(String[] args) {

        Instant instant = Instant.ofEpochSecond(3);
        Instant instant2 = Instant.ofEpochSecond(3, 0);
        Instant instant3 = Instant.ofEpochSecond(4, 1_000_000_000);

        System.out.println(instant);
        System.out.println(instant2);
        System.out.println(instant3);







    }


}
