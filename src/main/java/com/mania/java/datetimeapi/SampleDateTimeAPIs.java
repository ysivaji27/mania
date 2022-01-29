package com.mania.java.datetimeapi;

import java.time.LocalDate;

public class SampleDateTimeAPIs {

    public static void main(String[] args) {
        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate = LocalDate.now().plusDays(1);
        System.out.println(localDate);


    }
}
