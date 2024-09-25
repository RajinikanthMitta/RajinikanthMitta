package Interface;

interface Demo
	{
	public void m1();
	}
interface Sample extends Demo
	{
	public void m2();
	}
class Display implements Sample
{
		public void m1()
	{
	System.out.println("m1 method executed");
	}

		public void m2()
	{
		System.out.println("m2 method executed");
	}

}

public class MainClass {
	public static void main(String[] args) {
		Display d1 = new Display ();
		d1.m1();
		d1.m2();
		
		
	}

}
