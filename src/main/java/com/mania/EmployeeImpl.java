package com.mania;

public class EmployeeImpl implements  Employee{

    @Override
    public EmployeeSO add(EmployeeSO employeeSO) {
        System.out.println(" Add ");
        return  new EmployeeSO();
    }

    @Override
    public void delete() {
        System.out.println(" Delete ");
    }

    @Override
    public void update() {
        System.out.println(" Update ");
    }
}
