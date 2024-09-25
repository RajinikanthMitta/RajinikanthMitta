package Java.MethodOverRiding;


class RBI{
	public double returns()
	{
		return 5.0;
	}
}

class ICICI extends RBI {
	@Override
	public double returns()
	{
		return 4.4;
	}
}
class SBI extends ICICI {
	@Override
	public double returns()
	{
		return 3.4;
	}
}
class Axis extends SBI {
	@Override
	public double returns()
	{
		return 6.4;
	}
}


public class Customer {
public static void main(String[] args) {
	
	ICICI I1 = new ICICI();
	SBI S1 = new SBI();
	Axis A1 = new Axis();
	RBI R1 = new RBI();
	 double returns;
	 
	 returns= I1.returns();
	 System.out.println("returns from ICICI : " +returns+"%");
	 
	 returns= S1.returns();
	 System.out.println("returns from SBI : " +returns+"%");
	 
	 returns= A1.returns();
	 System.out.println("returns from Axis : " +returns+"%");
	 
	 returns= R1.returns();
	 System.out.println("returns from RBI : " +returns+"%");
	 
 }
}
