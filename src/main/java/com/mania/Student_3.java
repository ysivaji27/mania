package com.mania;

public class Student_3 {
    public static void main(String[] a){
        for (int i=0;i<=2;i++){
            for (int j=i;j<=5;j++){
                if(i==1){
                    continue;
                }
                System.out.println("Numbers are: i="+i +" J="+j);
            }
        }
    }
}
