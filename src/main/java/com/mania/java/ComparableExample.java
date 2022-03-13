package com.mania.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop> {
    String name;
    int ram;
    int price;
    public Laptop(String name, int ram, int price) {
        super();
        this.name = name;
        this.ram = ram;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public int compareTo(Laptop laptop) {
        System.out.println(this.name +":"+laptop.name+":"+this.ram+">"+laptop.getRam()+" "+(this.ram > laptop.getRam()?1:-1));
        if (this.ram > laptop.getRam())
            return 1;
        else {
            return -1;
        }
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("LENOVO", 1, 600));
        laptopList.add(new Laptop("HP", 2, 600));
        laptopList.add(new Laptop("Dell", 4, 600));
        laptopList.add(new Laptop("Apple", 8, 100));
        laptopList.add(new Laptop("HCL", 16, 800));

        Collections.sort(laptopList);
        for (Laptop lap : laptopList) {
            System.out.println(lap.getRam());
        }
        laptopList.stream().sorted().forEach(m-> System.out.println(m.ram));
    }
}
