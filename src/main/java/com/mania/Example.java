package com.mania;

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
public class Example {
    public static void main(String[] args) {
        //Method reference to a constructor
        MyInterface ref = Hello::new;
        ref.display("Hello World!","Java");
    }
}