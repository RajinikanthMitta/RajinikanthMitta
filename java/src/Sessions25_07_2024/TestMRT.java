package Sessions25_07_2024;

public class TestMRT {

	public static int m1()
	{
		return 100;
		
	}
	public static double m2()
	{
		return 12.5;
		
	}
	public static boolean m3()
	{
		return false;
	}
	public static String m4()
	{
		return "GSH IT SOLUTIONS";
	}
	public static void main(String[] args) {
		
		System.out.println("main starts");
		
		int n =m1(); // value return by m1 is stored
		System.out.println(n);
		
		double d = m2();
		
		System.out.println(d);
		boolean flag = m3();
		
		
		System.out.println(flag);
		String str = m4();
		
		System.out.println(str);
		
		System.out.println("main ends");
		
	}
}
