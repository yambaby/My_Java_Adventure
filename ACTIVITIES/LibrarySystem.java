package ACTIVITIES;

import java.util.Scanner;

public class LibrarySystem {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.print("Add title: ");
            String title = scanner.nextLine();
            System.out.print("Add Author: ");
            String author = scanner.nextLine();

            Book book = new Book(title, author, false);
            while (true){
                System.out.println("MENU: ");
                System.out.println("1. Borrow Book");
                System.out.println("2. Return Book");
                System.out.println("3. Display Book");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        book.borrowBook();
                        break;
                
                    case 2:
                        book.returnBook();
                        break;

                    case 3:
                        book.display();
                        break;
                    
                    case 4:
                        scanner.close();
                        return;
                }   
            }

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
    }

    public void borrowBook(){
        if (borrowed == false){
            borrowed = true;
            System.out.println("You borrowed this book.");
        }

        else {
            System.out.println("This book is already borrowed.");
        }
    }

    public void returnBook(){
        if (borrowed == true){
            borrowed = false;
            System.out.println("You returned this book. Thank u for reading!");
        }

        else{
            System.out.println("You didn't borrow this book.");
        }
    }

    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (borrowed == true){
            System.out.println("Status: Borrowed");
        }

        else{
            System.out.println("Status: Not Borrowed");
        }
    }
}
