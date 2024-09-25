package Sessions07_08_2024;

class 	Demo2
{
	Demo2()
	{
		this(10);
		System.out.println("non parameterized constructor");
	}
	
	Demo2(int a)
	{
		this("java");
		System.out.println("int parameterized constructor");
	}
	Demo2(String b)
	{
		System.out.println("string parameterized constructor");
	}
	
}


public class Chaining {
public static void main(String[] args) {
	Demo2 d1 = new Demo2();
	
	
}
}
