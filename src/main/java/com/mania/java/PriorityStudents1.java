package com.mania.java;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student1 implements  Comparable<Student1>{

    int id ;
    String name ;
    double cpga;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpga() {
        return cpga;
    }

    public void setCpga(double cpga) {
        this.cpga = cpga;
    }
    public Student1(int id ,String name ,  double cpga){
        this.id = id;
        this.name = name;
        this.cpga = cpga;
    }

    @Override
    public int compareTo(Student1 student1) {
        double diff = student1.cpga  - this.cpga;
        if(diff == 0D){
            if(student1.name.equals(this.name)){
                return  student1.id - this.id;
            }else{
                return this.name.compareTo(student1.name);
            }
        }
        return diff<0 ? -1 :1;
    }
}
class Priorities1 {

    public List<Student1> getStudents(List<String> events) {
        int id ;
        String name ;
        double cpga;
        String[] vals = null;
        PriorityQueue<Student1> pq = new PriorityQueue<>();
        for (String event: events ) {
            vals = event.split(" ");
            if(vals.length == 4){
                name =  vals[1];
                cpga  = Double.parseDouble(vals[2]);
                id = Integer.parseInt(vals[3]);
                pq.add(new Student1(id,name,cpga));
            }else{
                pq.poll();
            }
        };
        List<Student1> res = new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        return  res;

    }
}
public class PriorityStudents1 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities1 priorities = new Priorities1();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student1> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student1 st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
