package Abstraction;


		abstract class Bike
			{
			public abstract void start();
			}

class KTM extends Bike
{
	public void start()
	{
		System.out.println("self start");
	}
}

class RE extends Bike
{
	public void start()
	{
		System.out.println("self start with kick or self");
	}
}

class Hero extends Bike
{
	public void start()
	{
		System.out.println("self start with kick");
	}
}

class Scooty extends Bike
{
	public void start()
	{
		System.out.println("start with legs");
	}
}


public class TestDrive {
public static void main(String[] args) {
	
	KTM duke200 = new KTM();
	RE classic350 = new RE();
	Hero splender = new Hero();
	Scooty zupitor = new Scooty();
	
	duke200.start();
	classic350.start();
	splender.start();
	zupitor.start();
	
}
}
