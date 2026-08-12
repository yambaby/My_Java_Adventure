package ACTIVITIES;

import java.util.ArrayList;
import java.util.Scanner;


public class LibrarySystem {
    
    static Scanner scanner = new Scanner(System.in);  
    public static void main(String[] args){  

        ArrayList<Book> books = new ArrayList<>();

        while(true){ 
            System.out.println("MENU: ");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

        switch (choice){
                case 1: 
                    System.out.print("Add Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Add Book Author: ");
                    String author = scanner.nextLine();
                    books.add(new Book(title, author));
                    break;

                case 2:
                    if (books.isEmpty() == true){
                        System.out.println("There are no books.");
                        break;
                    }

                    System.out.println("--LIST OF BOOKS--");
                    displayBooks(books);
                    System.out.print("Enter Book Number to Borrow: ");
                    int i = scanner.nextInt();
                    books.get(i - 1).borrowBook();
                    break;

                case 3:
                    if (books.isEmpty() == true){
                        System.out.println("There are no books.");
                        break;
                    }
                    System.out.println("--LIST OF BOOKS--");
                    displayBooks(books);
                    System.out.print("Enter Book Number to Return: ");
                    int n = scanner.nextInt();
                    books.get(n - 1).returnBook();
                    break;

                case 4:
                    if (books.isEmpty() == true){
                        System.out.println("There are no books.");
                        break;
                    }
                    System.out.println("--LIST OF BOOKS--");
                    for (int j = 0; j < books.size(); j++){
                        System.out.print((j + 1) + ". ");
                        books.get(j).display();
                    }
                    break;

                case 5:
                    System.out.println("Exiting the Program. Thank you for using the library. ");
                    return;

                default:
                    System.out.println("Invalid input. Try again.");
                    break;
            }
        }
    }

    static void displayBooks(ArrayList<Book> books){
        for (int i = 0; i < books.size(); i++){
            System.out.print((i + 1) + ". ");
            books.get(i).display();
        }
    }
}
class Book{
    String title;
    String author;
    boolean borrowed;

    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.borrowed = false;
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
            System.out.println(title + " - " + author + " (Borrowed)");
            }
            else{
            System.out.println(title + " - " + author + " (Available)");
            }
    }

}

