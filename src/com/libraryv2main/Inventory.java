package com.libraryv2main;

import java.util.*;

public class Inventory {
    void listOfInventoryCheck(String Inventory1) {
        List<String> book = new ArrayList<>();
        book.add("Introduction to algorithms");
        book.add("Java the complete reference");
        book.add("Cracking the coding interview");
        book.add("Let us c");
    }
    void listOfInventoryDisplay() {
        List<String> book = new ArrayList<>();
        book.add("Introduction to algorithms");
        book.add("Java the complete reference");
        book.add("Cracking the coding interview");
        book.add("Let us c");
        System.out.println("list of books:"+book);
    }
    void listOfInventoryInitial() {
        List<String> book = new ArrayList<>();
        book.add("Introduction to algorithms");
        book.add("Java the complete reference");
        book.add("Cracking the coding interview");
        book.add("Let us c");
        System.out.println("list of books:"+book);
    }
    void listOfInventory(String newAdd) {
        List<String> book = new ArrayList<>();
        book.add("Introduction to algorithms");
        book.add("Java the complete reference");
        book.add("Cracking the coding interview");
        book.add("Let us c");
        book.add(newAdd);
        System.out.println("success the book "+newAdd+" has been returned");
        System.out.println("list of books:"+book);
    }
    void listOfInventoryRemove(String newremove) {
        List<String> book = new ArrayList<>();
        book.add("Introduction to algorithms");
        book.add("Java the complete reference");
        book.add("Cracking the coding interview");
        book.add("Let us c");
        if (book.contains(newremove)) {
            book.remove(newremove);
            System.out.println("success "+newremove+" has been withdrawn");
        } else {
            System.out.println("the books is not available");
            System.exit(1);
        }
        System.out.println("list of books:"+book);
    }
}
class InventoryMethods {
    void add() {
        Scanner scanner = new Scanner(System.in);
        String newAdd = scanner.nextLine();
        Inventory inventory = new Inventory();
        inventory.listOfInventory(newAdd);
    }
    void display() {
        Inventory inventory = new Inventory();
        inventory.listOfInventoryDisplay();
    }
    void displayInitial() {
        Inventory inventory = new Inventory();
        inventory.listOfInventoryInitial();
    }
    void remove() {
        Scanner scanner = new Scanner(System.in);
        String newRemove = scanner.nextLine();
        Inventory inventory = new Inventory();
        inventory.listOfInventoryRemove(newRemove);
    }
}