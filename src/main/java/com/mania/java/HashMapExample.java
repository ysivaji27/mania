package com.mania.java;

import lombok.Data;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Data
class Employee {
    private long id;
    private String name;
    private Date dateOfBirth;
    private BigDecimal salary;

    //Getter and Setters
    // to String
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        if (id != employee.id) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(employee.dateOfBirth) : employee.dateOfBirth != null) return false;
        return salary != null ? salary.equals(employee.salary) : employee.salary == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        return result;
    }
}

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Employee,String> employeeMap = new HashMap<Employee,String>();
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("Sachin");
        employee1.setDateOfBirth(new Date(1987,2,1));
        employee1.setSalary(new BigDecimal(100000));
        // Step 1
        employeeMap.put(employee1,"India");

        for (Map.Entry<Employee, String> employeeStringEntry : employeeMap.entrySet()) {
            System.out.println(employeeStringEntry.getKey().hashCode());
        }
        // Step 2
        // Mutating the Employee Object
        employee1.setName("Rahul");

        for (Map.Entry<Employee, String> employeeStringEntry : employeeMap.entrySet()) {
            System.out.println(employeeStringEntry.getKey().hashCode());
        }
        // The HashMap key is mutated and in the wrong bucket for that hashcode.
        // Step 3
        System.out.println(employeeMap.get(employee1));
        // Returns null

        Employee employee2 = new Employee();
        employee2.setId(1);
        employee2.setName("Sachin");
        employee2.setDateOfBirth(new Date(1987,2,1));
        employee2.setSalary(new BigDecimal(100000));

        System.out.println(employeeMap.get(employee2));
        employeeMap.forEach((k,v)-> System.out.println(k+""+v)) ;
        // Returns null



        BankAccount anotherAccount = new BankAccount.BankAccountBuilder()
                .owner("Homer")
                .branch("Springfield")
                .build();

        System.out.println(anotherAccount.getOwner());


        StringBuilder builder = new StringBuilder("Temp");

        String data = builder.append(1)
                .append(true)
                .append("friend")
                .toString();


        //Join stream of string values
        List<String> blogNameParts = Arrays.asList("how", "to", "do", "in", "java");
        String strTotal = blogNameParts.stream().collect(Collectors.joining(","));
        System.out.println("strTotal-->"+strTotal);
        StringJoiner joiner = new StringJoiner(",", "[", "]");

        System.out.println(joiner.toString());

        joiner.setEmptyValue("EMPTY");

        System.out.println(joiner.toString());

        joiner.add("how");
        joiner.add("to");
        joiner.add("do");
        joiner.add("in");
        joiner.add("java");

        System.out.println(joiner.toString());
    }

}
