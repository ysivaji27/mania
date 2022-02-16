package com.mania.java;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Singleton{

    public  static String str ;
    private static Singleton singleton = null;
    private Singleton(){
        str = "Hello I am a singleton! Let me say hello world to you";
    }
    public static Singleton  getSingleInstance(){
        if(singleton == null){
            synchronized(Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }

}

public class JavaMD5 {


    private String toString(List<DrugStrength> aDrugStrengthList) {
        StringBuilder str = new StringBuilder();
        for (DrugStrength aDrugStrength : aDrugStrengthList) {
            if (!aDrugStrength.isValidDrugDescription()) {
                aDrugStrengthList.remove(aDrugStrength);
            }
        }

        for(Iterator<DrugStrength> itDrus = aDrugStrengthList.iterator(); itDrus.hasNext();){
            DrugStrength drugStrength =   itDrus.next();
        }
        str.append(aDrugStrengthList);
        if (str.indexOf("]") != -1) {
            str.insert(str.lastIndexOf("]"), "\n          " );
        }
        return str.toString();
    }


    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Read and save the input String *//*
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();

        *//* Encode the String using MD5 *//*
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        byte[] digest = md.digest();

        *//* Print the encoded value in hexadecimal *//*
        for (byte b : digest) {
            System.out.format("%02x", b);
        }
        Singleton singleton =  Singleton.getSingleInstance();
        System.out.println(singleton.str);

        Integer [] myNum = new Integer[0];*/

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer [] myNum = new Integer[n];
        for(int i =0 ; i < n ; i ++){
            myNum[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < myNum.length; i++) {
            System.out.println(myNum[i]);
        }

        Singleton singleton =  Singleton.getSingleInstance();
        Singleton singleton1 =  Singleton.getSingleInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton.hashCode());

        Comparator<String> c = (s1,s2)->s1.compareTo(s2);
        Predicate<Integer> value = val->val>10;

        System.out.println("-->"+ c.compare("tt","cc"));
    }
}