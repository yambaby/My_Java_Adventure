package ACTIVITIES;

import java.util.Scanner;

public class Grade {
    
    public static void main(String[] args){

        Scanner grade = new Scanner(System.in);

        System.out.print("Student: ");
        String student = grade.nextLine();

        System.out.print("Grade #1: ");
        int one = grade.nextInt();

        System.out.print("Grade #2: ");
        int two = grade.nextInt();

        System.out.print("Grade #3: ");
        int three = grade.nextInt();

        System.out.print("Grade #4: ");
        int four = grade.nextInt();

        System.out.print("Grade #5: ");
        int five = grade.nextInt();

        float avg = (one + two + three + four + five) / 5;

        System.out.print("Average: ");
        System.out.printf("%.1f%n", avg);
        System.out.println();

        if (avg >= 75){
            System.out.println("Result: Passed");
        }

        else{
            System.out.println("Result: Failed");
        }

        grade.close();

    }
}
