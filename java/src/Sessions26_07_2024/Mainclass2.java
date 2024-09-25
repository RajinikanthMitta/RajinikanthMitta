package Sessions26_07_2024;

class A1  // SUPERMOST CLASS
{
	public void m1()
	{
		System.out.println("m1 executed");
	}
}
class B1 extends A1  // IMMEDIATE SUBCLASS
{
	public int x=10;
}
class C extends B1 // sub class

{
	public double y = 20.5;
	public void display()
	{
		m1();
		System.out.println(x);
		System.out.println(y);
	}
}

public class Mainclass2 {
public static void main(String[] args) {
	C c1= new C();
	
	c1.display();
}
}
