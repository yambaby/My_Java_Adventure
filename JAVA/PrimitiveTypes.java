package JAVA;

public class PrimitiveTypes {
    public static void main(String[] args) {
        float sum = function(); // acessing function
        System.out.printf("%.2f%n", sum); // two decimal point
    }

    public static float function(){
        long a = 5_323_123_123L; //long
        final float B = 5.65F; //float final - it makes it so that it cannot be changed/permanent. all constants should have an all CAPITAL LETTERS name

        float sum = (float) a * B;
        return sum;
    }
}
