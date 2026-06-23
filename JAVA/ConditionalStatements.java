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

class If{
    public static void main(String[] args){
        
        int temp = 32;

        if (temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink water"); //only need curly bracket if multiple statements, otherwise it's not really needed
        } 
        else if (temp > 20 && temp <= 30){
            System.out.println("Beautiful day");
        } 
        else
            System.out.println("Cold day");
        }

        int income = 120_000;
        if (income > 100_000){
            
        }

}
