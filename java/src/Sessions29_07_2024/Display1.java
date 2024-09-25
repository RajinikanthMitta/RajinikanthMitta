package Sessions29_07_2024;

public class Display1 {

	public void show (int a)
	{
		System.out.println(a);
	}
	
	public void show (String a)
	{
		System.out.println(a);
	}
	
	public void show (String a, String b)
	
	{
		System.out.println("two strings:" +a+ ", "+b);
	}
	
	
	public static void main(String[] args) {
		
		Display1 dis = new Display1();
		dis.show(123);
		dis.show("kalyan");
		dis.show("umakanth", "kedhar");
		
	}
}
