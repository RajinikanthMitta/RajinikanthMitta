package Java;

class A 
{
	static int x =10;
	double y=20.8;
}

class B extends A
{
	char ch = 'J';
}



public class Inheritance {
public static void main(String[] args) {
	
	B b1 = new B();
	System.out.println(b1.x);
	System.out.println(b1.y);
	System.out.println(b1.ch);
}
}
