package JAVA;

import java.awt.*;

public class Drafts {

    public static void main(String[] args){
        Point point1 = new Point(1,1); 
        Point point2 = point1; //both point1 and point 2 point to the same object

        point1.x = 2;

        String message = "Hello World" + "!!!";
        message.endsWith("le");
        message.startsWith("Hello");

        System.out.println(point2.x);
        System.out.println();

        boolean x = Hi();
        System.out.println(x);

    }

    static boolean Hi(){
        String message = "Hello World" + "!!!";

        return message.endsWith("le");
    }
    
}

