package JAVA;

public class ConditionalStatements {   
    public static void main(String[] args){
        //int x = 1;
        //int y= 1;
        //System.out.println(x == y);

        //int x = 1;
        //int y= 1;
        //System.out.println(x != y);

        // <, <=, >=, >

        int temp = 40;
        boolean isWarm = temp > 20 && temp < 30; //left to right
        System.out.println(isWarm);
        
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hadCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hadCriminalRecord;
        System.out.println(isEligible);
    }
}

class IfElseStatements{
    public static void main(String[] args){
        
        int temp = 32;

        if (temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink water"); //only need curly bracket if multiple statements, otherwise it's not really needed. Although it's recommended to use always
        } 
        else if (temp > 20 && temp <= 30){
            System.out.println("Beautiful day");
        } 
        else
            System.out.println("Cold day");

        int income = 120_000;
        boolean hasHighIncome = false; // u can only declare variables inside a code block, so it's not possible to declare inside if statements, unless there's curly braces. but if declared inside, u cannot access it outside the block, so it's recommended to declare variable outside if statements.
        if (income > 100_000){
            hasHighIncome = true;
        }
        //u can also do this to be shorter and more clear
        //boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
    }
}

class SwitchStatements{
    public static void main(String[] args){
        String role = "admin";

        switch (role){
            case "admin":
                System.out.println("You're an admin");
                break;
            
            case "moderator":
                System.out.println("You're a moderator");
                break;
            
            default:
                System.out.println("hello");

        }

        // if (role.equals("admin")){ //also, == checks the reference itself while .equals() compares the content itself
            // System.out.println("You're an admin");
        // }
        // else if (role.equals("moderator")){
            // System.out.println("You're a moderator");
        // }
        // else 
            // System.out.println("hello");
        }
    }
