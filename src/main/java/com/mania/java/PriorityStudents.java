package com.mania.java;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
class Student implements Comparable<Student>{
    int id;
    String name;
    double cgpa;

    @Override
    public int compareTo(Student student) {
        double diffCGPA = student.cgpa - this.cgpa;
        if (diffCGPA == 0D) {
            if (student.name.equals(this.name)) {
                return student.id - this.id;
            } else {
                System.out.println("A".compareTo("B"));
                System.out.println("B".compareTo("A"));
                return this.name.compareTo(student.name);
            }
        } else {
            return diffCGPA < 0 ? -1 : 1;
        }
    }
}

class Priorities {
    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        List<Student> res = new ArrayList<>();
        String[] vals;
        String name;
        double cgpa;
        int id;
        for (String e : events) {
            vals = e.split(" ");
            if (vals.length == 4) {
                name = vals[1];
                cgpa = Double.parseDouble(vals[2]);
                id = Integer.parseInt(vals[3]);

                pq.add(new Student(id, name, cgpa));
            } else {
                pq.poll();
            }
        }

        while(!pq.isEmpty()) {
            res.add(pq.poll());
        }
        return res;
    }
}

public class PriorityStudents {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
