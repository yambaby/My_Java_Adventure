package ACTIVITIES;

import java.util.Scanner;

public class GradeActivity2 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Number of grades: ");
        int amount = scanner.nextInt();

        int[] grades = new int[amount];

        for (int i = 0; i < amount; i++){
            System.out.print("Enter grade [" + (i + 1) + "]: ");
            grades[i] = scanner.nextInt();
        }
        
        System.out.println("Name: " + name);
        System.out.println("Highest number: " + highestGrade(grades));
        System.out.println("Lowest number: " + lowestGrade(grades));
        int average = average(grades);
        System.out.println("Average: " + average);
        System.out.println("Letter: " + letter(average));
    }

    static int highestGrade(int[] grades){
        int highest = grades[0];

        for (int i = 1; i < grades.length; i++){
            if (grades[i] > highest){
                highest = grades[i];
            }
        }
        return highest;
    }

    static int lowestGrade(int[] grades){
        int lowest = grades[0];

        for (int i = 1; i < grades.length; i++){
            if (grades[i] < lowest){
                lowest = grades[i];
            }
        }

        return lowest;
    }

    static int average(int[] grades){
        int sum = 0;

        for (int grade : grades){
            sum += grade;
        }

        int avg = sum / grades.length;

        return avg;
    }

    static String letter(int avg){

        String lttr;

        if (avg >= 90 && avg <= 100){
            lttr = "A";
        }

        else if (avg >= 80){
            lttr = "B";
        }

        else if (avg >= 70){
            lttr = "C";
        }

        else if (avg >= 60){
            lttr = "D";
        }

        else {
            lttr = "E";
        }

        return lttr;
    }

}
