package com.mania;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TestClass {

    public static void main(String[] args) {
       // extracted();
        Random random = new Random();
        random.ints(5).limit(5).forEach(System.out::println);


        String inputDate = "09 November";
        String regex ="[0-9]{1,2} (November|December){1}";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(inputDate);
        System.out.println(m.matches());


        EmployeeSO emp2 = new EmployeeSO();
        emp2.setEmpId(2);
        emp2.setAddress("New Salata 2 " );
        emp2.setFirstName(" first name 2 ");

        Employee employee = new EmployeeImpl();
        EmployeeSO employeeSO = employee.add(emp2);

    }

    private static void extracted() {
        String name = "Malayalm Mohanlal";
        Map<Character,Integer> charCountMap = new HashMap<>();

        for(int i=0;name.length()>i;i++){
         char charStr =   name.charAt(i);
         if(charCountMap.get(charStr)!=null){
             Integer count = charCountMap.get(charStr)+1;
             charCountMap.put(charStr,count);
         }else{
             charCountMap.put(charStr,1);
         }
        }

        for( Character character :  charCountMap.keySet()){
            System.out.println(character +" " + charCountMap.get(character));
        }

        charCountMap.forEach((k,v)-> System.out.println(k+""+v));

        String s = new String("MOHA");


        String text = null;
        String defaultText = Optional.ofNullable(text).get();
        System.out.println(defaultText);


        Map<Integer,String> empMap = new HashMap<>();
        empMap.put(1,"emp1");
        empMap.put(2,"emp2");
        List<String> empNamesList = empMap.values().stream().collect(Collectors.toList());
        empNamesList.stream().forEach(System.out::println);


        List<String> list = Arrays.asList("A","B","C","D");

        Optional<String> result = list.stream().findAny();
        System.out.println(result);
    }

    public  static void  add(int i ,String s  ){

    }
}
