package Java;

public class Employee {
	
	int eid;
	String name;
	double sal;
	String loc;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(sal);
		System.out.println(loc);
	}
	public static void main(String[] args) {
		
	System.out.println("----first employee details-----");	
		
		Employee emp1 = new Employee();
		emp1.eid=216;
		emp1.name="Rajinikanth";
		emp1.sal=24734;
		emp1.loc="Hyderabad";
		emp1.display();
		
	System.out.println("----second employee details-----");	
		Employee emp2 = new Employee();
		emp2.eid=200;
		emp2.name="Kedareshwar";
		emp2.sal=24700;
		emp2.loc="Kompally";
		emp2.display();
		
	}
	
}
