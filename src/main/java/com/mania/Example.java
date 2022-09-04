package com.mania;


import javax.validation.constraints.NotNull;


@FunctionalInterface
interface MyInterface{
    Hello display(String say,String hi);

}
class Hello{
    public Hello(String say,String hi){
        System.out.print(say+" "+hi);
    }

    public Hello(String say){
        System.out.print(say);
    }

}

class NullCheck {

    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(@NotNull final String employeeId) {
        this.employeeId = employeeId;
    }
}
public class Example {
    public static void main(String[] args) {
        //Method reference to a constructor
        MyInterface ref = Hello::new;
        ref.display("Hello World!","Java");

        NullCheck check = new NullCheck();
        check.setEmployeeId(null);
        System.out.println(check.getEmployeeId());

    }
}