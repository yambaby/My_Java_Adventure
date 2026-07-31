package ACTIVITIES;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.print("Enter size of array (click 0 to exit): ");
        int size = scanner.nextInt();
        
        if (size == 0){
            scanner.close();
            return;
        }
        
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("ELement " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for(int index = 0; index < size / 2; index++){
            int otherIndex = size - 1 - index;

            int temp = array[index]; // temp = 0
            array[index] = array[otherIndex]; // array[0] = array[5]
            array[otherIndex] = temp;
        }

        System.out.print("Reversed: ");
        for(int j = 0; j < size; j++){
            if (j == size - 1){
                System.out.print(array[j]);
            }
            else {
                System.out.print(array[j] + ", ");
            }
        }

        System.out.println();
        
        }
    }
}
