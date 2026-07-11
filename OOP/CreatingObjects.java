package OOP;

//NOTES

/*
Method - function inside class
Class - this is where we create objects
Object - an entity or an instance of a class. basic building block of OOP 

Ex.1: Let's say class is a car. You can create objects like Mitsubishi, Ford, etc.
Ex.2: Vehicle. You can create cars, bike, boats, etc.

class Vehicle -> int wheels; -> String vehicleDescription -> Vehicle car = new Vehicle(); -> car.wheels = 2; -> and so on....

FOUR PILLARS OF OOP
Encapsulation - this is where data is protected and can only be accessed with methods (bank keeps money private & can only be access with withdraw() and deposit())
Abstraction - hides the implementation details of methods and only shows what the object do (driving a car without knowing how engine works internally)
Inheritance - allows one class(child/subclass) to inherit properties and methods from another class (parent/superclass)
Polymorphism - same methods behave differently based on the object (like a draw() method works differently for different shape class like Circle, Square, Triangle, etc.)

@Override - it allow multiple subclass to provide its own unique implementation to the method defined already inside parent class 
extends - allows child class to inherit methods from parent class (class Child extends Parent)

ex. 1: 
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

Access Modifiers
default (no access modifiers)    // package-private (same package only)
public  // accessible from any package
private // only inside the same class
protected // same package or subclasses anywhere

Ask yourself:

Does another class need this?

Yes = public

No = private

Only subclasses? = protected

Only package? = Default

*/

public class CreatingObjects {

    class Liam{
        int money;
    }

    public static void main(String[] args){
        Date now = new Date(); // since Date is a separate top-level class, we can instantiate it directly.
        Date nowTwo = new Date(); // u can also add another object

        CreatingObjects hello = new CreatingObjects(); // since it's inside the class of Helloworld, it needs to be declared first
        CreatingObjects.Liam liam = hello.new Liam(); //then u can access the inner class after

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
    }
}

class Date{
    int age;
    String name;

    void bark(){
        System.out.println("woof!");
    }

}
