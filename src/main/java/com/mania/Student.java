package com.mania;

import java.sql.SQLOutput;

public class Student {

    public static void main(String[] args) {
        String address = "Noida, India";
        if (address.endsWith("India"))
        {
            if (address.contains("Noida")) {
                System.out.println("You belong to Noida");
            } else if (address.startsWith("Meerut")) {
                System.out.println("you belong to Meerut");
            } else {
                System.out.println(address.split(",")[0]);
            }
        }else{
            System.out.println("you dont belong to india");
        }
    }
}

