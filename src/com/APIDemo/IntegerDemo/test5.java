package com.APIDemo.IntegerDemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test5 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2000, 3, 1);
        System.out.println(ld.minusDays(1));

        //≈–∂œ»ÚƒÍ
        System.out.println(ld.isLeapYear());
    }
}
