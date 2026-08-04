package ACTIVITIES;

import java.util.Scanner;

public class Rotator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter set of numbers: ");
        String n = scanner.nextLine();

        String[] parts = n.split(" ");

        int[] array = new int[parts.length];

        for (int i = 0; i < parts.length; i++){
            array[i] = Integer.parseInt(parts[i]);
        }

        System.out.print("Shift: ");
        int shift = scanner.nextInt();

        rotator(array, shift);

        for (int arr : array){
            System.out.print(arr + " ");
        }

        scanner.close();

    }

    static void rotator(int[] array, int shift){
        //shift %= arrayt.length;
        int j = 0;

            do{
                for (int i = array.length - 1; i > 0; i--){
        
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
            
                }
        
                j++;
            } while (j < shift);

        }

    }


