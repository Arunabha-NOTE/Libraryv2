package com.libraryv2main;

import java.util.Scanner;

public class LibraryV2 {
    public static void main(String[] args) {
        StudentMethods studentMethods = new StudentMethods();
        LibrariansMethods librariansMethods = new LibrariansMethods();
        InventoryMethods inventoryMethods = new InventoryMethods();

        System.out.println("Welcome to the library how can i help?:");
        System.out.println("1-login,2-display list of books available:");

        Scanner scanner = new Scanner(System.in);
        int option1 = scanner.nextInt();

        switch (option1) {
            case 1:
                System.out.println("Are you a 1-student or a 2-librarian");
                option1 = scanner.nextInt();
                switch (option1) {
                    case 1:
                        System.out.println("Enter your name");
                        studentMethods.check();
                        option1 = scanner.nextInt();
                        switch (option1) {
                            case 1:
                                System.out.println("Enter the name of the book you wish to deposit:");
                                inventoryMethods.add();
                                break;
                            case 2:
                                System.out.println("Enter the name of the book you wish to withdraw:");
                                inventoryMethods.remove();
                                break;
                            default :
                                System.out.println("Invalid");
                                System.exit(1);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Enter your name:");
                        librariansMethods.check();
                        option1 = scanner.nextInt();
                        switch (option1) {
                            case 1:
                                System.out.println("Enter the name of the book you wish to deposit:");
                                inventoryMethods.add();
                                break;
                            case 2:
                                System.out.println("Enter the name of the book you wish to withdraw:");
                                inventoryMethods.remove();
                                break;
                            case 3:
                                System.out.println("Enter the name of the student you want to add:");
                                studentMethods.add();
                                break;
                            case 4:
                                System.out.println("Enter the name of the student you want to add:");
                                studentMethods.remove();
                                break;
                            case 5:
                                System.out.println("Enter the name of the librarian you want to add:");
                                librariansMethods.add();
                                break;
                            case 6:
                                System.out.println("Enter the name of the librarian you want to remove:");
                                librariansMethods.remove();
                                break;
                            default:
                                System.out.println("Invalid");
                                System.exit(1);
                                break;
                        }
                        System.out.println("would you like to display the list of 1-students 2-librarians 3-books");
                        option1 = scanner.nextInt();
                        switch (option1) {
                            case 1:
                                studentMethods.displayInitial();
                                break;
                            case 2:
                                librariansMethods.displayInitial();
                                break;
                            case 3:
                                inventoryMethods.displayInitial();
                                break;
                            default:
                                System.out.println("Not valid");
                                System.exit(1);
                                break;
                        }
                    break;
                    default:
                        System.out.println("Invalid");
                        System.exit(1);
                        break;
                }
                break;
            case 2:
                inventoryMethods.displayInitial();
                break;
            default:
                System.out.println("invalid");
                System.exit(1);
                break;
        }
        System.out.println("Have a good day!");
        scanner.close();
    }
}