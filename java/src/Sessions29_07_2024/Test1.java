package Sessions29_07_2024;


class A 
{
	public void m1()
	{
		System.out.println("m1 in A");
	}
}
class B extends A
{
	
}

class C extends B
{
	@Override
	public void m1()
	{
		System.out.println("m1 in C");
	}
}



public class Test1 {
	public static void main (String[]args)
	{
		C c1 = new C();
		c1.m1();
	}

}
