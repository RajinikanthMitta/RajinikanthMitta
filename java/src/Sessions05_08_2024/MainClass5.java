package Sessions05_08_2024;

interface A1
{
	public void M1();
	
}
interface B1 extends A1
{
	public void M2();
	
}

interface C1 extends A1
{
	public void M3();
	
}
class D implements B1
{
	public void M1()
	{
		System.out.println("M1 executed");
		
	}
	public void M2()
	{
		System.out.println("M2 executed");
	}
}
class E implements C1 
{
	public void M1()
	{
		System.out.println("M1 executed");
		
	}
	public void M3()
	{
		System.out.println("M3 executed");
	}
}




public class MainClass5 {
public static void main(String[] args) {
	
	
	
	D d1 = new D();
	d1.M1();
	d1.M2();
	
	E e1 = new E();
	e1.M1();
	e1.M3();
	
}
}
