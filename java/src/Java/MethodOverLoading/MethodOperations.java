package Java.MethodOverLoading;

public class MethodOperations {
	// Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
    	MethodOperations mathOps = new MethodOperations();
        System.out.println("Sum of 2 and 3: " + mathOps.add(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + mathOps.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5: " + mathOps.add(2.5, 3.5));
        
        
    }
  
}
