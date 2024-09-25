package Sessions25_07_2024;

public class StaticMethod {
	
	
	public  void m1()  // non  static method
	{
		System.out.println("m1 executed");
	}
	
	public static void main(String[] args) {
		
		//m1(); // accessing statioc method directly
		new StaticMethod().m1();  // by using  new and class name
		
	}

}
