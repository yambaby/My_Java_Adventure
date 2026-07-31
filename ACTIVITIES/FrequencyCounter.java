package ACTIVITIES;

import java.util.Scanner;

public class FrequencyCounter {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter set of numbers: ");
        String n = scanner.nextLine();

        String[] parts = n.split(" ");

        int[] array = new int[parts.length];

        for (int i = 0; i < parts.length; i++){
            array[i] = Integer.parseInt(parts[i]);
        }

        uniqueElements(array);

    }

    static void uniqueElements(int[] array){

        int[] unique = new int[array.length];
        unique[0] = array[0];
        int uniqueCount = 1;
        for (int i = 1; i < array.length; i++){
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++){
                if (array[i] == unique[j]){
                    found = true;
                    break;
                }
            }

            if (found == false){
                unique[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        int frequency;

        for(int index = 0; index < uniqueCount; index++){
            frequency = 0;

            for(int jndex = 0; jndex < array.length; jndex++){
                if (unique[index] == array[jndex]){
                    frequency++;
                }
            }
        
        System.out.println(unique[index] + " has occured " + frequency + " times");

        }
    }  
}
