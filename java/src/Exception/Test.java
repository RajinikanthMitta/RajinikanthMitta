package Exception;


// class cast exception


public class Test {
    public static void main(String[] args) {
        System.out.println("main starts");

        // Creating an instance of A and assigning it to a variable of type A
        A a = new A();

        // Creating an instance of B and assigning it to a variable of type A (polymorphism)
        A b = new B();

        // Calling m1 method on both instances
        a.m1();  // This will call m1 method of class A
        b.m1();  // This will call the overridden m1 method of class B

        System.out.println("main ends");
    }
}

