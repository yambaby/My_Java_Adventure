package Practice;

import java.util.Scanner;

public class Prac2 {

    static class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    static Node head = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        
        while(true){

            System.out.println("1. Insert At Beginning ");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert After Position");
            System.out.println("4. Print List");
            System.out.print("Enter a choice: ");
            int choice;

            try{
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (Exception e){
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            switch (choice){
                case 1:
                    System.out.print("Enter value to put in beginning: ");
                    String value1 = scanner.nextLine();

                    insertAtBeginning(value1);
                    break;
                
                case 2:
                    System.out.print("Enter value to put at end: ");
                    String value2 = scanner.nextLine();

                    insertAtEnd(value2);
                    break;


                case 3: 
                    System.out.print("Enter value to put: ");
                    String value3 = scanner.nextLine();
                    System.out.print("At what position to put (only numbers): ");
                    
                    try {
                        int pos = Integer.parseInt(scanner.nextLine());
                        insertAfterPosition(value3, pos);
                    } catch (Exception e) {
                        System.out.println("Invalid. Try Again");
                    }

                    break;

                case 4:
                    printLinkedList();
                    break;
            }
        }
    }

    static void insertAtBeginning(String data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    static void insertAtEnd(String data){
        Node newNode = new Node(data);
        
        if (head == null){
            head = newNode;
    }

        // now u need to traverse the list, starting from head
        Node last = head;

        //loop to reach end of list where last.next = null
        while(last.next != null){
            last = last.next;
        }

        last.next = newNode;
    }

    static void insertAfterPosition(String data, int position){
        
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        
        Node temp = head;
        int index = 1;

        while(temp != null && index < position){
            temp = temp.next;
            index++;
        }

        if (temp == null){
            System.out.println("THis position is out of bounds.");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

    }

    static void printLinkedList(){

        if (head == null){
            System.out.println("List is Empty.");
            return;
        }

        Node current = head;
        int index = 1;

        while (current != null){
            System.out.println("[" + index + "] - " + current.data);
            current = current.next;
            index++;
        }

    }

    
}

