package Java.MethodOverLoading;

public class Sample {
	public static void add(int a,int b) 
		{
		int sum =a+b;
		System.out.println("sum of"+a+"&"+b+ "is:" +sum);
		}
	public static void add (int a, double b)
		{
		double sum = a+b;
		System.out.println("sum of"+a+"&"+b+ "is:" +sum);
		}
	public static void add (double a, int b)
		{
		double sum = a+b;
		System.out.println("sum of"+a+"&"+b+ "is:" +sum);
		}	
	public static void add (double a, double b)
		{
		double sum = a+b;
		System.out.println("sum of"+a+"&"+b+ "is:" +sum);
		}
	public static void main(String[] args) {
		add(5, 10);
		add(5, 4.4);
		add(6.5, 3);
		add(3.2, 4.4);
		
	}
	
		
	
}
