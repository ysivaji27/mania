package com.mania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainProgram {

    public static void main(String[] args) {

        Employee empObj = new EmployeeImpl();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(empObj);

        List<String> stringslist = new ArrayList<>();
        stringslist.add("screen1");
        stringslist.add("screen2");
        stringslist.add("screen3");
        stringslist.add("screen4");
        stringslist.add("screen5");


        List<Integer> integerlist = new ArrayList<>();
        integerlist.add(1);
        integerlist.add(10);
        integerlist.add(12);
        integerlist.add(3);
        integerlist.add(0);

       // findBignumber(integerlist);
        String test = "Test Message1";
        System.out.println(test.substring(test.lastIndexOf("1")));

    }
    public static void main2(String[] args) {
        ArrayList<Integer> intlist =new ArrayList<>();
        intlist.add(3);
        intlist.add(3);
        intlist.add(3);
        intlist.add(3);
    }

//        ArrayList<Integer> arrL = new ArrayList<>();
//
//        List<String> stringslist = Arrays.asList("sdasdasda 1","3eeqeqeq 1","eqwe qeqeqweqweq 1","czczxcczzcxzc 1");
//        stringManipulations(stringslist);

    private static void findBignumber(List<Integer> integerlist){
        int temp =0 ;
        for (int i =0 ; integerlist.size() >i ; i++){
            if(integerlist.get(i)>temp){
                temp = integerlist.get(i);
            }
        }
        System.out.println(temp);
    }

   private static void findBig(List<Integer> intlist){
        int temp=0;
        for(int i=0;intlist.size()>i;i++){
            if(intlist.get(i)>temp){
                temp=intlist.get(i);
            }

        }
   }



//    private static void stringManipulations( List<String> stringslist){
//
//        System.out.println(stringslist.stream().count());
//
//        System.out.println(stringslist.stream().map(value->value.replace("1","")).collect(Collectors.toList()));
//
//        System.out.println(stringslist.stream().map(value->value.substring(0,6)).collect(Collectors.toList()));
//    }
}
