package com.mania;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestClass {

    public static void main(String[] args) {
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
