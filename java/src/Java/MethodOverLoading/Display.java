package Java.MethodOverLoading;

//Overloading with Different Parameter Types

public class Display {
	// Method to display a single integer
    public void show(int a)
    {
        System.out.println("Integer: " + a);
    }

    // Overloaded method to display a single string
    public void show(String a)
    {
        System.out.println("String: " + a);
    }

    // Overloaded method to display two strings
    public void show(String a, String b)
    {
        System.out.println("Two Strings: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.show(5);
        display.show("Hello");
        display.show("Hello", "World");
    }
}

