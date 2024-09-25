package Sessions08_08_2024;

public class Exception1 {
public static void main(String[] args) {
	
	int a= 20;
	int b= 5;
	
	System.out.println("main starts");
	
	System.out.println("value of a: " +a);

	System.out.println("value of b: " +b);
	
	
	try
	{
		int c= a/b;
		System.err.println("value of c: " +c);
	}
	catch (ArithmeticException ae)
	{
		System.out.println(" kindly dont enter 0");
	}
		
	System.out.println("main ends");
}
}
