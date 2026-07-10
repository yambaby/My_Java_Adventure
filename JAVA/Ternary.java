package JAVA;

public class Ternary {
     public static void main(String[] args){
        int income = 120_000;
        String className = income > 100_000 ? "High" : "Low"; // condition ? "first action(if)" : "second action(else)"

        System.out.println(className);
    }
}
