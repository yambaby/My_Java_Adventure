package ACTIVITIES;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter: ");
        String n = scan.nextLine();

        String[] numbers = n.split(" ");
        int result = Integer.parseInt(numbers[0]);

        for (int i = 1; i < numbers.length; i += 2){
            String operator = numbers[i];
            int value = Integer.parseInt(numbers[i + 1]);

            if (operator.equals("+")){
                result += value;
                }

            else if (operator.equals("-")){
                result -= value;
                }
            
            else if (operator.equals("*")){
                result *= value;
                }
            
            else if (operator.equals("/")){
                result /= value;
                }
            
            else{
                System.out.println("Invalid");
            }
        }

        System.out.println("Final Answer: " + result);
        scan.close();
    }
}
