package Sessions26_07_2024;


class A
{
	static int x =10; // static variable
	double y = 20.8;  // non static variables
}

class B extends A    // B is child class of A
{
	char ch = 'Z';
}




public class SingleLevelInheritance {
public static void main(String[] args) {
	
	System.out.println("main starts");
	
	B b1 = new B();
	
	System.out.println(b1.x);
	
	System.out.println(b1.y);
	
	 System.out.println(b1.ch);
	 
	 System.out.println("main ends");
	
}
}
