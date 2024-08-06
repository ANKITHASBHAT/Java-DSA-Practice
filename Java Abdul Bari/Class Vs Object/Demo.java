// Demonstrating Java OOP Concepts
public class Demo {

    // Base class demonstrating Encapsulation and Abstraction
    abstract static class Animal {
        private String name; // Encapsulated field

        // Constructor with Parameter
        public Animal(String name) {
            this.name = name;
        }

        // Abstract method (Abstraction)
        public abstract void makeSound();

        // Getter for the encapsulated field
        public String getName() {
            return name;
        }
    }

    // Derived class demonstrating Inheritance
    static class Dog extends Animal {
        // Constructor
        public Dog(String name) {
            super(name);
        }

        // Implementing abstract method (Polymorphism)
        @Override
        public void makeSound() {
            System.out.println(getName() + " says: Woof!");
        }

        // Method demonstrating additional functionality
        public void fetch() {
            System.out.println(getName() + " is fetching the ball.");
        }
    }

    // Another derived class demonstrating Inheritance
    static class Cat extends Animal {
        // Constructor
        public Cat(String name) {
            super(name);
        }

        // Implementing abstract method (Polymorphism)
        @Override
        public void makeSound() {
            System.out.println(getName() + " says: Meow!");
        }

        // Method demonstrating additional functionality
        public void scratch() {
            System.out.println(getName() + " is scratching the furniture.");
        }
    }

    // Interface demonstrating Abstraction
    interface Playable {
        void play(); // Abstract method
    }

    // Class implementing an interface
    static class Parrot extends Animal implements Playable {
        // Constructor
        public Parrot(String name) {
            super(name);
        }

        // Implementing abstract method (Polymorphism)
        @Override
        public void makeSound() {
            System.out.println(getName() + " says: Squawk!");
        }

        // Implementing interface method
        @Override
        public void play() {
            System.out.println(getName() + " is playing with toys.");
        }
    }

    // Main method demonstrating Classes, Objects, Methods, Parameters, and Arguments
    public static void main(String[] args) {
        // Creating objects (Instances of classes)
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Parrot parrot = new Parrot("Polly");

        // Calling methods with Arguments
        animalActions(dog); // Passing object as an Argument
        animalActions(cat); // Passing object as an Argument
        animalActions(parrot); // Passing object as an Argument

        // Demonstrating Polymorphism with interface
        Playable playableParrot = parrot; // Interface reference to object
        playableParrot.play(); // Polymorphic behavior

        // Additional actions for specific animals
        dog.fetch();
        cat.scratch();
    }

    // Method with Parameter of type Animal
    static void animalActions(Animal animal) {
        System.out.println("Welcome to the Zoo! Meet " + animal.getName());
        animal.makeSound(); // Polymorphic method call
    }
}
