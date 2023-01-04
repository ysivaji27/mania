package com.mania;

public class Main extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("2 : "+amount);
        amount++;
        System.out.println("3 : "+amount);
    }

    public void run() {
        System.out.println("1 : "+amount);
        amount++;
    }
}