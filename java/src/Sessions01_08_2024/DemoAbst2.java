package Sessions01_08_2024;


abstract class A  //parent class
{
	public abstract void m1();
	public abstract void m2();
}
 abstract class Boss extends A   // parent class as well as child class
{
	public  void m1()
	{
		System.out.println("m1 compleed in first child class");
	}
}
class C1  extends  Boss
{
	public  void m2()
	{
		System.out.println("m2 completed in second sub class");
	}
}



public class DemoAbst2 {
public static void main(String[] args) {
	
	C1 C = new C1();
	C.m1();
	C.m2();
	
	
}
}
