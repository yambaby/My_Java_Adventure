package OOP;

/* 
CONSTRUCTORS - method called when object is created. with constructors, u can create unique objects

No-argument constructors - no parameters (mostly for default variables/methods)
Parametirized constructors - accepts parameters

*/

public class Constructors {
    
    public static void main(String[] args){
        Dog dog1 = new Dog(); //no argument
        Dog dog2 = new Dog(7, "Snowy"); //with parameters

        System.out.println(dog1.name);
        System.out.println(dog1.age);

        System.out.println(dog2.name);
        System.out.println(dog2.age);

        dog1.bark();
        dog2.bark();

    }
}

class Dog{

    int age;
    String name;

    Dog(){ //no argument / default
        this(1, "dog");
    }

    //parametirized
    Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    void bark(){
        System.out.println("woof!");
    }

}
