package Java.MethodOverLoading;

//Overloading with Different Order of Parameters


public class DataPrinter {
	// Method to print integer and string
    public void Data(int a, String b) 
     {
        System.out.println("Integer: " + a + ", String: " + b);
     }

    // Overloaded method to print string and integer
    public void Data(String a, int b) 
     {
        System.out.println("String: " + a + ", Integer: " + b);
     }

    public static void main(String[] args) {
        DataPrinter p = new DataPrinter();
        p.Data(10, "Ten");
        p.Data("Twenty", 20);
        
    }
}
