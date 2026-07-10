package JAVA;

import java.util.Arrays;
/*
primitive or reference types implemented multiple times - method overloading

Arrays.toString - to be able to see the array since it will only print its address if u print the name of the array only
Arrays.deepToString - to be able to print two dimensional array

*/
public class Array {

    public static void main(String[] args){
        int[] numbers = new int[5]; 
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers)); 
    }   
    
}

class ArrayWithGiven{
    public static void main(String[] args){
    int[] re = {2, 3, 4, 5, 1};
        Arrays.sort(re);
        System.out.println(Arrays.toString(re));
        System.out.println(re.length);
    }
}

class TwoDimensionalArray{
    public static void main(String[] args){
        int[][] twoDimensionalArray = new int[2][2]; // first [] is row, while second [] is column
        twoDimensionalArray[0][0] = 1;
        System.out.println(Arrays.deepToString(twoDimensionalArray));

        int[][] twoDimensional = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(twoDimensional));
    }
}

class ThreeDimensionalArray{
    public static void main(String[] args){
        int[][][] threeDimensionalArray = new int[2][2][2];
        threeDimensionalArray[0][0][0] = 2;
        System.out.println(Arrays.deepToString(threeDimensionalArray));
    }
}