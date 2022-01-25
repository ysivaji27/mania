package com.mania.java.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaClass {
    public static void main(String[] args) {
        LambdaClass lambdaClass = new LambdaClass();
        lambdaClass.lambdaExpressions();
        lambdaClass.stringFun();

        LambdaClass foo = parameter -> buildString(parameter);
    }

    private static Object buildString(Object parameter) {
        String result = "Something " + parameter;
        //many lines of code
        return result;
    }

    private void lambdaExpressions() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> { System.out.println(n); });

        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach(method);
    }

    private void stringFun() {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    private String buildString(String parameter) {
        String result = "Something " + parameter;
        //many lines of code
        return result;
    }
}
