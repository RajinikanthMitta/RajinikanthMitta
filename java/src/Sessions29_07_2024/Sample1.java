package Sessions29_07_2024;

public class Sample1 {

	public static void add (int a, int b)
	{
		int sum=a+b;
		System.out.println(+sum);
	}
	public static void add (int a, double b)
	{
		double sum = a+b;
		System.out.println(+sum);
	}
	public static void add (double a, double b)
	{
		double sum = a+b;
		System.out.println(+sum);
	}
	
	public static void main(String[] args) {
		
		
		
		add(10, 12);
		add (12, 30.5);
		add(15.3, 12.5);
	}
	
}
