package com.mania.java.datetimeapi;

import java.time.LocalDate;
import java.util.Comparator;

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}


class Checker implements Comparator<Player>{
    @Override
    public int compare(Player a, Player b){
        if (a.score == b.score){
            return a.name.compareTo(b.name);//alphabetically
        } else {
            return b.score - a.score;//decreasing
        }
    }
}

public class SampleDateTimeAPIs {

    public static void main(String[] args) {
        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate = LocalDate.now().plusDays(1);
        System.out.println(localDate);


    }
}
