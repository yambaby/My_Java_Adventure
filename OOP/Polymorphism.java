package OOP;

public class Polymorphism {
    public static void main(String[] args) {

        Anima frog = new Frog();
        Anima cow = new Cow();
        Anima animal = new Anima();

        animal.makeSound();
        frog.makeSound();
        cow.makeSound();
    }
}

class Anima {

    void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Frog extends Anima {

    @Override
    void makeSound() {
        System.out.println("Ribbit!");
    }
}

class Cow extends Anima {

    @Override
    void makeSound() {
        System.out.println("Moo!");
    }
}
