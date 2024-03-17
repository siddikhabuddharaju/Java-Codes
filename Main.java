class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method inherited from Animal
    void sound() {
        System.out.println("Barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Calls the sound method from Dog class
    }
}
