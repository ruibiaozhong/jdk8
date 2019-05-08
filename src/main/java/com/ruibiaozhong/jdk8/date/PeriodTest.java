package com.ruibiaozhong.jdk8.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {


    public static void main(String[] args) {
        Period period = Period.between(LocalDate.of(2014, 3, 8), LocalDate.of(2014, 3, 18));
        System.out.println(period.getDays());

        System.out.println("---------------------------------------");

        Period tenDays = Period.ofDays(10);
        Period threeWeeks = Period.ofWeeks(3);
        Period twoYearsSixMonthsOndDay = Period.of(2, 6, 1);

        System.out.println(tenDays);
        System.out.println(threeWeeks);
        System.out.println(twoYearsSixMonthsOndDay);

    }







}
