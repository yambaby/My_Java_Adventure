package JAVA;

//NOTES

/*
Method - function inside class
Class - this is where we create objects
Object - an entity or an instance of a class. basic building block of OOP 

Ex.1: Let's say class is a car. You can create objects like Mitsubishi, Ford, etc.
Ex.2: Vehicle. You can create cars, bike, boats, etc.

class Vehicle -> int wheels; -> String vehicleDescription -> Vehicle car = new Vehicle(); -> car.wheels = 2; -> and so on....
*/


public class Helloworld {

    class Liam{
        int money;
    }

    public static void main(String[] args){
        Date now = new Date(); // u can just allocate directly if accessing outside the class

        Date nowTwo = new Date(); // u can also add another object

        Helloworld hello = new Helloworld(); // since it's inside the class of Helloworld, it needs to be declared first
        Helloworld.Liam liam = hello.new Liam(); //then u can access the inner class after

        liam.money = 10000;

        now.age = 15;
        now.name = "Liam";
        nowTwo.age = 32;
        nowTwo.name = "Mr. Bean";

        System.out.println("Dog's name: " + now.name); // Liam
        System.out.println("Dog's age: " + now.age); // 15

        System.out.println("Dog's name: " + nowTwo.name); // Mr. Bean
        System.out.println("Dog's age: " + nowTwo.age); // 32

        now.bark();
        nowTwo.bark();

        System.out.println(liam.money);
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

class Date{
    int age;
    String name;

    void bark(){
        System.out.println("woof!");
    }

}
