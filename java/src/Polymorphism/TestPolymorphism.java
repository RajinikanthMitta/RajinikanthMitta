package Polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        // Compile-time polymorphism (method overloading)
        Animal animal = new Animal();
        System.out.println("Sum of integers: " + animal.add(5, 3));          // Calls add(int, int)
        System.out.println("Sum of doubles: " + animal.add(5.5, 3.3));      // Calls add(double, double)

        // Runtime polymorphism (method overriding)
        Animal myDog = (Animal) new Dog();   // Dog object referenced by Animal type
        Animal myCat = new Cat();   // Cat object referenced by Animal type

        // Calling the overridden methods
        myDog.makeSound();  // Outputs: Bark
        myCat.makeSound();  // Outputs: Meow

        // Creating Animal reference and assigning different objects
        Animal animalReference; 

        animalReference = new Dog();
        animalReference.makeSound();  // Outputs: Bark

        animalReference = new Cat();
        animalReference.makeSound();  // Outputs: Meow
    }
}
