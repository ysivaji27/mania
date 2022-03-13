package com.mania.mongodb.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);
    static String str ;
    public static void main(String[] args) throws IOException {
        Test  test = new Test();
        System.out.println(str);
    }
    public Test(){
        System.out.println("in C ");
        str = "Hello World";
    }

    private static void scannerFOR2() {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int calNumber = a;
            for(int j = 0 ; j<=n;j++){
                calNumber  = calNumber + (int)  (Math.pow(2,j)*b);
                System.out.printf("%d ",calNumber);
            }
            System.out.println("");
        }
        in.close();
    }

    private static void scannerFOR() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i =1 ; i<=10 ; i++){
            System.out.printf("%d x %d = %d%n",n,i,n*i);
        }
        bufferedReader.close();
        System.out.println();

    }

    private static void scanner4() {
        String data = "Hello World!";
        int x = 9876;
        Date date = new Date();
        System.out.printf("Printing multiple data at once: %S %d %tc \n", data,x,date);
        System.out.printf("'%15s' %n", "baeldung");
        System.out.printf("%-15s %03d %n", data, x);

        System.out.printf("%b%n", null);
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 5.3);
        System.out.printf("%b%n", "random text");

    }

    private static void scanner3() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    private static void  scanner2(){
       int n = scanner.nextInt();
       scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       scanner.close();

       if(n%2==1 || (n>=6 && n <= 20)){
           System.out.println("Weird");
       }else{
           System.out.println("Not Weird");
       }

   }
    private static void  scanner1(){
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);
    }
}
