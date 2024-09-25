package Sessions26_07_2024;



class Lion    //parent class
{
	void king()
	{
		System.out.println("king of forest");
	}
}

class Tiger extends Lion // child class
{
	void kingmaker()
	{
		System.out.println("kingmaker of forest");
	}
}

class Deer extends Lion  // child class
{
	void hunt()
	{
		System.out.println("lion hunt deer");
	}
}



public class HierarchicalInheritance {
public static void main(String[] args) {
	 Deer d = new Deer();
	 d.king();
	 d.hunt();
	// d.kingmaker();
	
	
	
}
}
