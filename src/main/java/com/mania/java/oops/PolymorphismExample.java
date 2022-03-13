package com.mania.java.oops;


import java.awt.print.Book;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
interface  testStatic {

    default boolean test(){
        return true;
    }
    boolean test1();
}

@FunctionalInterface
interface  testStatic2 {

    boolean test1();
}

class Animal implements testStatic ,testStatic2{
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public boolean test1() {
        return false;
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public String toString() {
        return " Animal : "+super.toString();
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Puppy extends Dog {
    public void animalSound1() {
        System.out.println("The Puppy says: bow wow");
    }
}

public class PolymorphismExample {
    private  void  test(){
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        //
        Animal  puppy =   new Puppy();
        puppy.animalSound();
    }
    public static void main(String[] args) {
        Animal ann = new Animal();
        ann.test1();
       // int number = 9 ;
       // Predicate<Integer> isPrime = n-> n%2!=0;
       // System.out.println(isPrime.test(number));
        Predicate<String> s = s1 -> s1.length() > 5;
        Predicate<Integer> isPrime = number ->  number>1 && IntStream.range(2,number).noneMatch(n->number%n==0);


        List<Double> primeNumbers = Stream.iterate(1,i->i+1)
                                    .filter(isPrime)
                                    .map(Math::sqrt)
                                    .limit(10)
                                    .collect(Collectors.toList());
        System.out.println(primeNumbers);
        List<Sport> sportList = Arrays.asList(
                new Sport("CHESS"),
                new Sport("CRICKET")
        );

        List<Employee> employeeList = Arrays.asList(
                new Employee("MALE", "J.R.R. Tolkien", 1954, 30,sportList,50),
                new Employee("MALE", "J.R.R. Tolkien", 1937, 40,sportList,55),
                new Employee("MALE", "George Orwell", 1945, 37,sportList,50),
                new Employee("FEMALE", "George Orwell", 1949, 55,sportList,50),
                new Employee("FEMALE", "George Orwell", 1937, 25,sportList,50),
                new Employee("FEMALE", "William Golding", 1954, 44,sportList,56)
        );
        Map<String, Long> soldCopiesStats = employeeList.stream()
                                        //.filter(book -> book.getSoldCopies() > 35)
                                        .peek(employee -> employee.getName())
                                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

       List<Employee>  empList = employeeList.stream()
                        .filter(emp -> emp.getSalary() > 50)
                        .filter(emp -> emp.sportList.contains("CHESS"))
                        .collect(Collectors.toList());


        System.out.println(soldCopiesStats);
        System.out.println(empList);

        Map<String ,Integer>  empMap = new HashMap<>();
        empMap.put("ABC",22);
        empMap.put("EDF",22);
        empMap.put("GHI",22);

       String[] empNames =   empMap.keySet().toArray(new String[empMap.size()]);
        //String[] empNamesList =  empMap.entrySet().stream().sorted(valueComparator.thenComparing(keyComparator)) .toArray(String[]::new);
        System.out.println(empNames);
    }

}
