class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    // Overloading the sound method inherited from Animal
    void sound(String type) {
        System.out.println("Barking: " + type);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Calls the sound method from Animal
        myDog.sound("loud"); // Calls the sound method from Dog with parameter
    }
}
