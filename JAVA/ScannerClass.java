package JAVA;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        //String name = scanner.next(); -> gets only the first TOKEN = 1 word (is read only when it has a space)
        //String name = scanner.nextLine(); -> gets all tokens
        //String name = scanner.nextLine().trim(); -> makes sure each token have only one spaces
        String name = scanner.nextLine();
        
        System.out.println("Your name: " + name);

    }
}
