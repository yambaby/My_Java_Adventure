package ACTIVITIES;

import java.util.Scanner;


public class LibrarySystem {
    
    static Scanner scanner = new Scanner(System.in);  
    public static void main(String[] args){  

        System.out.print("Amount of Books: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        Book[] books = new Book[amount];

        for (int i = 0; i < books.length; i++){
            System.out.print("Add Book " + (i + 1) +" title: ");
            String title = scanner.nextLine();
            System.out.print("Add Book "+ (i + 1) + " Author: ");
            String author = scanner.nextLine();
            books[i] = new Book(title, author, false);
        }
        
        while(true){
            System.out.println("--LIST OF BOOKS--");
            displayBooks(books);
            System.out.print("Enter book number (0 to exit): ");
            int bookNum = scanner.nextInt();
            if (bookNum == 0){
                scanner.close();
                break;
            }

            if (bookNum > books.length || bookNum < 1){
                System.out.println("Invalid number. Try again.");
                continue;
            }
            commandMenu(books, bookNum);
        }
    }

    static void commandMenu(Book[] books, int bookNum){
        System.out.println("MENU: ");
        System.out.println("1. Borrow Book");
        System.out.println("2. Return Book");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    books[bookNum - 1].borrowBook();
                    break;

                case 2:
                    books[bookNum - 1].returnBook();
                    break;

                default:
                    System.out.println("Invalid input. Try again.");
                    break;

            }
    }

    static void displayBooks(Book[] books){
        for (int i = 0; i < books.length; i++){
            System.out.print((i + 1) + ". ");
            books[i].display();
        }
    }
}

class Book{
    String title;
    String author;
    boolean borrowed = false;

    Book(String title, String author, boolean borrowed){
        this.title = title;
        this.author = author;
        this.borrowed = borrowed;
    }

    public void borrowBook(){
        if (!borrowed){
            borrowed = true;
            System.out.println("You borrowed " + title + " by " + author + ".");
        }

        else {
            System.out.println(title + " by " + author + " is already borrowed.");
        }
    }

    public void returnBook(){
        if (borrowed){
            borrowed = false;
            System.out.println("You returned " + title + " by " + author + ". Thank u for reading!");
        }

        else{
            System.out.println("You didn't borrow " + title + " by " + author + ".");
        }
    }

    public void display(){
            if(borrowed){
            System.out.println(title + " - " + author + " - (Borrowed)");
            }
            else{
            System.out.println(title + " - " + author + " - (Available)");
            }
    }

}

