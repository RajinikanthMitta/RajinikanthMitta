package Sessions18_07_2024;

public class NestedIf {
public static void main(String[] args) {
	
	
	String address = "delhi, india";
	
	
if(address.endsWith("india"))
		if (address.contains("goa"))
			{
			System.out.println("your city is goa");
			}
			
			else if (address.contains("hyd"))
			{
			System.out.println("your city is hyd");
			}
		else
			{
			System.out.println(address);
			}
else
	{
		System.out.println("you are living in india");
	}
	
}
}
