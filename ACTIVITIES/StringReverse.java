package ACTIVITIES;

import java.util.Scanner;

public class StringReverse {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter word (X to exit): ");
            String input = scanner.nextLine();
            
            if (input.equals("X")){
                scanner.close();
                break;
            }

            String reversed = reverse(input);
            System.out.println("Reversed form: " + reversed);

        }
        
    }

    static String reverse(String input){

        char[] array = input.toCharArray();

        int left = 0, right  = array.length - 1;

        while (left < right){
            swap(array, left, right);
            left++;
            right--;
        }

        return new String(array); //since it's an object, not a method
    
    }

    static void swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
