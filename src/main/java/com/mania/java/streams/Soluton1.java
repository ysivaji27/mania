package com.mania.java.streams;

import com.mania.java.oops.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
class Person{
    int id;
    String name;
    Sex gender;
    int age;
    public enum Sex {
        MALE, FEMALE;
    }
}
public class Soluton1 {


    public static void main(String[] args) {
        Person pp =   new Person();
        pp.setAge(11);

        List<Person> roster = new ArrayList<>();
        roster.add(new Person(1,"LENOVO", Person.Sex.MALE ,60));
        roster.add(new Person(2,"LENOVO", Person.Sex.FEMALE, 62));


        // Average
        double average = roster
                .stream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        // Total age of all the employees
        double totalAges = roster
                .stream()
                .map(Person::getAge)
                .reduce(0,(pr,b)->pr+b);

        //Count of Employees by Gender
        Map<Person.Sex,List<String>> namesByGender =roster.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getGender,
                                        Collectors.mapping(Person::getName,Collectors.toList())
                                )
                        );

        namesByGender.forEach((k,v)-> System.out.println(k +""+v));

        //Count of Employees
        Map<Person.Sex, Long> countByGender = roster.stream()
                //.peek(employee -> employee.getName())
                .collect(Collectors.groupingBy(Person::getGender, Collectors.counting()));

        System.out.println(countByGender);

        Map<Person.Sex, Double> averageAgeByGender = roster.stream()
                .collect(Collectors.groupingBy(Person::getGender,
                                                Collectors.averagingInt(Person::getAge)
                                                )
                );


        // Creating a List of Strings
        List<String> strList = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");
        // Using Stream flatMap(Function mapper)
        strList.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);

        // Creating a list of Prime Numbers
        List<Integer> primeNumbers = Arrays.asList(5, 7, 11,13);
        // Creating a list of Odd Numbers
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5);
        // Creating a list of Even Numbers
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts = Arrays.asList(primeNumbers, oddNumbers, evenNumbers);
        System.out.println("The Structure before flattening is : " + listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println("The Structure after flattening is : " + listofInts);
    }
}
