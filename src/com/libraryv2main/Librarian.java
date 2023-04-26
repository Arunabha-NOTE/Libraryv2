package com.libraryv2main;

import java.util.*;

public class Librarian {
    void ListOfLibrariansInitial() {
        List<String> librarian = new ArrayList<>();
        librarian.add("Pujan");
        librarian.add("Jatan");
        librarian.add("Pranav");
        System.out.println("current list of Librarians = "+librarian);
    }
    void ListOfLibrariansCheck(String Librarian1) {
        List<String> librarian = new ArrayList<>();
        librarian.add("Pujan");
        librarian.add("Jatan");
        librarian.add("Pranav");
        if (librarian.contains(Librarian1)) {
            System.out.println("Welcome Librarian what do you want to do?");
            System.out.println("1-Deposit a book 2-Withdraw a book 3-add students 4-remove students 5-add librarians 6-remove librarians:");
        } else {
            System.out.println("Invalid user");
            System.exit(1);
        }
    }
    void ListOfLibrariansDisplay() {
        List<String> librarian = new ArrayList<>();
        librarian.add("Pujan");
        librarian.add("Jatan");
        librarian.add("Pranav");
    }
    void ListOfLibrarians(String newadd) {
        List<String> librarian = new ArrayList<>();
        librarian.add("Pujan");
        librarian.add("Jatan");
        librarian.add("Pranav");
        System.out.println("The Librarian has been successfully added");
        System.out.println("Current list of Librarians = "+librarian);
    }
    void ListOfLibrariansremove(String newremove) {
        List<String> librarian = new ArrayList<>();
        librarian.add("Pujan");
        librarian.add("Jatan");
        librarian.add("Pranav");
        if (librarian.contains(newremove)) {
            librarian.remove(newremove);
            System.out.println("Success the student "+newremove+" has been removed from the list");
        } else {
            System.out.println("Not in database");
            System.exit(1);
        }
        System.out.println("current list of Librarians = "+librarian);
    }
}
class LibrariansMethods {
    void add() {
        Scanner scanner = new Scanner(System.in);
        String newadd = scanner.nextLine();
        Librarian librarian = new Librarian();
        librarian.ListOfLibrarians(newadd);
    }
    void check() {
        Student student1 = new Student();
        Scanner scanner = new Scanner(System.in);
        String Librarian1 = scanner.nextLine();
        student1.ListOfStudentsCheck(Librarian1);
    }
    void displayInitial() {
        Librarian librarian = new Librarian();
        librarian.ListOfLibrariansInitial();
    }

    void remove() {
        Scanner scanner = new Scanner(System.in);
        String newremove= scanner.nextLine();
        Librarian librarian = new Librarian();
        librarian.ListOfLibrarians(newremove);

    }
}