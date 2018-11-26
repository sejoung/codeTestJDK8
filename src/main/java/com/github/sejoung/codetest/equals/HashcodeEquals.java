package com.github.sejoung.codetest.equals;

import java.util.HashSet;

public class HashcodeEquals {
    public static void main(String[] args) {
        /*
        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));

        */
        /*
        Student alex = new Student(1, "Alex");
        List< Student > studentsLst = new ArrayList< Student >();
        studentsLst.add(alex);
        System.out.println("Arraylist size = " + studentsLst.size());
        System.out.println("Arraylist contains Alex = " + studentsLst.contains(new Student(1, "Alex")));
        */
        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");
        HashSet< Student > students = new HashSet < Student > ();
        students.add(alex1);
        students.add(alex2);
        System.out.println("HashSet size = " + students.size());
        System.out.println("HashSet contains Alex = " + students.contains(new Student(1, "Alex")));

    }
}
