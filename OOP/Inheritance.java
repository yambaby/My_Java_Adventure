package OOP;

public class Inheritance {
    public static void main(String[] args) {

        Lion lion = new Lion("Liam");
        Tiger tiger = new Tiger("Kim");

        lion.eat();   // Inherited from Hayop
        lion.growl();  // Dog's own method

        System.out.println("Dog's name: " + lion.getName());
        System.out.println("Cat's name: " + tiger.getName());
        
    }
}

class Hayop {

    String name;

    Hayop(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Lion extends Hayop {

    Lion(String name){
        super(name);
    }

    void growl() {
        System.out.println(name + " says growl!");
    }
}

class Tiger extends Hayop {

    Tiger(String name){
        super(name);
    }

    void meow() {
        System.out.println(name + " says meow!");
    }
}
