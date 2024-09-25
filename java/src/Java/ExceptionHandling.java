package Java;

public class ExceptionHandling {
	
	public static void main(String[]args) {
		
		String name[] = {"raju","ramesh","rao","srinu"};

		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		 
		try {
			System.out.println(name[5]);
			
		} catch (Exception e)  {
			// TODO: handle exception
			System.out.println("sorry its out of bond");

		}
	}
}
