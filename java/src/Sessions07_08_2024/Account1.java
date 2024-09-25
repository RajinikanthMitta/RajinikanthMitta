package Sessions07_08_2024;


// constructor overloading

public class Account1 {

	String name;
	long mobile;
	long adhar;
	String pan;
	
	Account1(String name)      // constructor 1
	{
		this.name= name;
	}
	Account1 (String name,long mobile )    // constructor 2
	{
		this.name= name;
		this .mobile= mobile;
	}
	
	Account1(String name,long mobile, long adhar )     // constructor 3
	{
		this.name= name;
		this .mobile= mobile;
		this.adhar = adhar;
	}
	Account1(String name,long mobile, long adhar, String pan )
	{
		this.name= name;
		this .mobile= mobile;
		this.adhar = adhar;
		this.pan=pan;
	}
public void display()
{
	System.out.println("name of the employee: "  +name);
	System.out.println("mobile no. of the employee: "  +mobile);
	System.out.println("adhar no. of the employee: "  +adhar);
	System.out.println("pan no. of the employee: "  +pan);
}
public static void main(String[] args) {
	
	Account1 a1 = new Account1("rajinikanth");
	a1.display();
	
	Account1 a2 = new Account1 ("rajinikanth", 9876543212L);
	a2.display();
	
	Account1 a3 = new Account1 ("rajinikanth", 9876543212L, 242334233423L);
	a3.display();
	
	Account1 a4 = new Account1 ("rajinikanth", 9876543212L, 242334233423L, "3244fs");
	a4.display();
	
	
}	
	
	
}
