package OOP;

public class Abstraction {
    public static void main(String[] args) {

        Nimal aso = new Aso();
        Nimal pusa = new Pusa();

        aso.makeSound();
        aso.sleep();

        pusa.makeSound();
        pusa.sleep();
    }
}

abstract class Nimal {

    // Abstract method (no body)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Aso extends Nimal {

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Pusa extends Nimal {

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}