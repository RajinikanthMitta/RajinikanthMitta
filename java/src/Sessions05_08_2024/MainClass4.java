package Sessions05_08_2024;



// creating  2 abstract method
// create 2 sub classes
// complete the 1 st incomplete method in 1st child class
//complete the 2 nd incomplete method in 2nd child class

abstract class A   // parent class
{
	public abstract void m1();
	public abstract void m2();
}
  abstract class B extends A   // 1st child class
 {
	 public void m1()
	 {
			 System.out.println( "m1 executed");
	 }
 }
class C extends B     // 2nd child class
{
	public void m2()
	{
		 System.out.println( "m2 executed");
	}
}




public class MainClass4 {
public static void main(String[] args) {
	
	C c1 = new C();
	c1.m1();
	c1.m2();
	
	
}
}
