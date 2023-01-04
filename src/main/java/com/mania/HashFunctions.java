package com.mania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// HashMap - put , get , how to display only keys , how to display only values
// HashMap - put , get , remove,clear,size,keySet,values
// HashSet -
public class HashFunctions {
    public static void main(String[] args) {
        HashMap<String , String> capitalcities = new HashMap<>();
        capitalcities.put("London","England");
        capitalcities.put("Delhi","India");
        capitalcities.put("Doha","Qatar");

//        System.out.println(capitalcities.get("bbb"));
//        capitalcities.remove("bbb");
//        capitalcities.clear();
//        System.out.println(capitalcities.size());
        for(String cityName :capitalcities.keySet())
            System.out.println(cityName);

        for(String countryNames :capitalcities.values())
            System.out.println(countryNames);

        for(String cityName :capitalcities.keySet())
            System.out.println(cityName + " --> " + capitalcities.get(cityName));

        System.out.println( "Sushma "+ 30 + 10);
        System.out.println( 30 + 10 +" Sushma ");


//        System.out.println(capitalcities);

        HashMap<String , List<String>>  countryWithCityNames = new HashMap<>();
        countryWithCityNames.put("India",Arrays.asList("Chennai","Hyderabad","Bangalore","Pune"));
        countryWithCityNames.put("Qatar",Arrays.asList("Lusail","Doha","New Salata"," Old Salata"));

        EmployeeSO emp1 = new EmployeeSO();
        emp1.setEmpId(1);
        emp1.setAddress("New Salata  1 ");
        emp1.setFirstName(" first name 1 ");

        EmployeeSO emp2 = new EmployeeSO();
        emp2.setEmpId(2);
        emp2.setAddress("New Salata 2 " );
        emp2.setFirstName(" first name 2 ");

        HashMap<Integer , EmployeeSO>  employeeHashMap = new HashMap<>();
        employeeHashMap.put(1,emp1);
        employeeHashMap.put(2,emp2);

        for(Integer empId :employeeHashMap.keySet())
            System.out.println(empId + " --> " + employeeHashMap.get(empId));

    }
}
