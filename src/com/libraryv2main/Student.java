package com.libraryv2main;

import java.util.*;

public class Student {
    void ListOfStudentsCheck(String Student1) {
        List<String> student = new ArrayList<>();
        student.add("Arunabha");
        student.add("Aryan");
        student.add("Anvit");
        if (student.contains(Student1)) {
            System.out.println("Welcome student what do you want to do?");
            System.out.println("1-Deposit a book 2-Withdraw a book");
        } else {
            System.out.println("Invalid user");
            System.exit(1);
        }
    }
    void ListOfStudentsInitial() {
        List<String> student = new ArrayList<>();
        student.add("Arunabha");
        student.add("Aryan");
        student.add("Anvit");
        System.out.println("Current list of students = "+student);
    }
    void ListOfStudentsDisplay() {
        List<String> student = new ArrayList<>();
        student.add("Arunabha");
        student.add("Aryan");
        student.add("Anvit");
        System.out.println("Current list of students = "+student);
    }
    void ListOfStudents(String newAdd) {
        List<String> student = new ArrayList<>();
        student.add(newAdd);
        student.add("Arunabha");
        student.add("Aryan");
        student.add("Anvit");
        System.out.println("Success student has been added");
        System.out.println("Current list of students = "+student);
    }
    void ListOfStudentsRemove(String newRemove) {
        List<String> student = new ArrayList<>();
        student.add("Arunabha");
        student.add("Aryan");
        student.add("Anvit");
        if (student.contains(newRemove)) {
            student.remove(newRemove);
            System.out.println("Success the student "+newRemove+" has been removed from the list");
        } else {
            System.out.println("Not in database");
            System.exit(1);
        }
        System.out.println("Current list of students = "+student);
    }
}
class StudentMethods {
    void add() {
        Scanner scanner = new Scanner(System.in);
        String newAdd = scanner.nextLine();
        Student student1 = new Student();
        student1.ListOfStudents(newAdd);
    }
    void check() {
        Student student1 = new Student();
        Scanner scanner = new Scanner(System.in);
        String Student1 = scanner.nextLine();
        student1.ListOfStudentsCheck(Student1);
    }
    void displayInitial() {
        Student student1 = new Student();
        student1.ListOfStudentsInitial();
    }
    void remove() {
        Scanner scanner = new Scanner(System.in);
        String newRemove= scanner.nextLine();
        Student student1 = new Student();
        student1.ListOfStudentsRemove(newRemove);
    }
}