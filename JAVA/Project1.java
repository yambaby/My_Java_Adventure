package JAVA;

import java.text.NumberFormat;
import java.util.Scanner;

public class Project1 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextFloat();

        System.out.print("Period (Years): ");
        int years = scanner.nextInt();

        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        double n = years * 12;

        double p1 = 1 + monthlyInterestRate;

        double mortgage = principal * ((monthlyInterestRate * Math.pow(p1, n)) / (Math.pow(p1, n) - 1));
        String mortgages = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgages);

        scanner.close();

    }
}
