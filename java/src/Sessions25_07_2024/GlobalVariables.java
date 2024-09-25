package Sessions25_07_2024;

public class GlobalVariables {

	
	public int a =20, b=-40;     // non ststic variables
	
	
	public static double c=23.5, d=30.3;   // static variables
	
	public static void main(String[] args) {
		
		
		System.out.println(new GlobalVariables().a );
		System.out.println(new GlobalVariables().b);
		
		System.out.println(c);
		System.out.println(d);
		
		
		
		
	}
}
