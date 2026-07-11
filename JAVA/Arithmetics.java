package JAVA;

import java.text.NumberFormat;


public class Arithmetics {
    
    public static void main(String[] args){
        double result = (double)10 / (double)3;
        System.out.println(result);

        // x is post fix, so y will get value of x first then the x will be incremented
        int x = 1;
        int y = x++;
        System.out.println(x); // 2
        System.out.println(y); // 1

        // opposite 
        int a = 1;
        int b = ++a;
        System.out.println(a); // 1
        System.out.println(b); // 2

        int w = 1;
        w += 2;
        System.out.println(w);

        //Implicit Casting -> it automatically converts values to bigger data type bytes > short > int
        short u = 1;
        int t = u + 4;
        System.out.println(t);

        //Explicit Casting -> need to declare what type in order to convert (int)
        int q = 1;
        double p = (int)q + 2;
        System.out.println(p);

        //user input always receive everything as string, so u need to parse to convert string to numerical values
        String s =  "3";
        int r = Integer.parseInt(s) + 2;
        //DOuble.parseDouble -> double
        System.out.println(r);
    }

}

class mathClass{

    public static void main(String[] args){
        //int result = Math.round(1.1F);
        //int result = (int)Math.ceil(1.1F); -> finds smallest possible number(whole) that is greater than the data input
        //int result = (int)Math.floor(1); -> finds largest number that is equal or smaller than data input
        //int result = Math.max(1, 4);
        //int result = Math.min(1,4);
        //double result = Math.random(); -> generates number between 0 & 1
        //int result = (int)(Math.random() * 10);
        //System.out.println(result);

        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        //String result = NumberFormat.getPercentInstance().format(0.1);

        
        String result = percent.format(0.1); // 10%
        System.out.println(result);

    }
}





