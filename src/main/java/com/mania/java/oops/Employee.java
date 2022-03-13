package com.mania.java.oops;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {
    private String gender;
    private String name;
    private int age;
    private int year;
    List<Sport> sportList;
    private int salary ;

}

@Data
@AllArgsConstructor
class Sport {

    private String name;


}