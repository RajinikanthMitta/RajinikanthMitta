package Polymorphism;

public class Animal {
    // Overridden method
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    // Overloaded method (Compile-time polymorphism)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
