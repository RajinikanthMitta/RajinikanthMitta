package Sessions29_07_2024;


class RBI  // parent class
{
	public double returns()  // non static method
	{
		return 5.0;
	}
}

class ICICI extends RBI // sub class1
{
	@Override
	public double returns()
	{
		return 6.3;
	}
}

class SBI extends RBI{  // sub class2
	@Override
	public double returns()
	{
		return 5.8;
	}
}
class AXIS extends RBI{  // subclass3
	@Override
	public double returns()
	{
	return 6.0;	
	}
}



public class Customer1 {
	public static void main(String[] args) {
		
		ICICI I1 = new ICICI();
		SBI S1 = new SBI();
		AXIS A1 = new AXIS();
		
		double returns;
		returns = I1.returns();
		System.out.println("returns from ICICI: " +returns+ "%");
		returns = S1.returns();
		System.out.println("returns from SBI: " +returns+ "%");
		returns = A1.returns();
		System.out.println("returns from AXIS: " +returns+ "%");
		
	}

}
