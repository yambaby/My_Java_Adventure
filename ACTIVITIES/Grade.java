package ACTIVITIES;

import java.util.Scanner;

public class Grade {
    
    public static void main(String[] args){

        Scanner grade = new Scanner(System.in);

        System.out.print("Student: ");
        String student = grade.nextLine();

        System.out.print("Enter number of grades to input: ");
        int amount = grade.nextInt();

        int[] grades = new int[amount];

        for (int i = 0; i < amount; i++){
            System.out.print("Grade #" + (i + 1) + ": ");
            grades[i] = grade.nextInt();
            
        }

        int sum = grades[0];

        for (int index = 1; index < amount; index++){
            sum += grades[index];
        }

        float average = (float) sum / amount;

        System.out.print("Name: " + student);
        System.out.print("Average: ");
        System.out.printf("%.1f%n", average);
        System.out.println();

        if (average >= 75){
            System.out.println("Result: Passed");
        }

        else{
            System.out.println("Result: Failed");
        }

        grade.close();

    }
}
