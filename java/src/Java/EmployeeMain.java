package Java;

public class EmployeeMain {

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
