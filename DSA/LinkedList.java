package DSA;

import java.util.Scanner;

public class LinkedList {
     // Node class
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert after a position");
            System.out.println("4. Delete a node by position");
            System.out.println("5. Print the list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid choice.");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter value to insert at the beginning (or 'x' to cancel): ");
                    String value1 = scanner.nextLine();

                    if (value1.equalsIgnoreCase("x"))
                        break;

                    insertAtBeginning(value1);
                    break;

                case 2:
                    System.out.print("Enter value to insert at the end (or 'x' to cancel): ");
                    String value2 = scanner.nextLine();

                    if (value2.equalsIgnoreCase("x"))
                        break;

                    insertAtEnd(value2);
                    break;

                case 3:
                    System.out.print("Enter new value to insert (or 'x' to cancel): ");
                    String value3 = scanner.nextLine();

                    if (value3.equalsIgnoreCase("x"))
                        break;

                    System.out.print("Insert after which position? (index starts at 0): ");

                    try {
                        int position = Integer.parseInt(scanner.nextLine());
                        insertAfterPosition(position, value3);
                    } catch (Exception e) {
                        System.out.println("Invalid position.");
                    }

                    break;

                case 4:
                    System.out.print("Enter position to delete (index starts at 0): ");

                    try {
                        int position = Integer.parseInt(scanner.nextLine());
                        deleteNodeByPosition(position);
                    } catch (Exception e) {
                        System.out.println("Invalid position.");
                    }

                    break;

                case 5:
                    printList();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Insert at beginning
    static void insertAtBeginning(String data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    static void insertAtEnd(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Insert after a given position
    static void insertAfterPosition(int position, String data) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        int index = 0;

        while (temp != null && index < position) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Inserted \"" + data + "\" after position " + position + ".");
    }

    // Delete by position
    static void deleteNodeByPosition(int position) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (position == 0) {
            head = head.next;
            System.out.println("Deleted node at position 0.");
            return;
        }

        Node temp = head;

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        temp.next = temp.next.next;

        System.out.println("Deleted node at position " + position + ".");
    }

    // Print list
    static void printList() {

        if (head == null) {
            System.out.println("[Empty List]");
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null) {
            System.out.println("[" + index + "]: " + current.data);
            current = current.next;
            index++;
        }
    }
}

