package com.mania.java;

import java.math.BigInteger;
import java.util.Scanner;
class PrintArray{
    <T> void printArray(T[] elements){
        for (T element : elements){
            System.out.println(element);
        }
    }
}
public class HTest1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger biga =   new BigInteger(sc.next());
        sc.nextLine();
        BigInteger bigb =   new BigInteger(sc.next());

        System.out.println(biga.add(bigb));
        System.out.println(biga.multiply(bigb));
    }
}
