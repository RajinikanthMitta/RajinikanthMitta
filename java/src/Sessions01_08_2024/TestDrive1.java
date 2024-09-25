package Sessions01_08_2024;

 abstract class Bike     // supermost class
 {
	 public  abstract void start();
 }
class KTM extends Bike    //sub class1
{
	public  void start()
	{
		System.out.println("self start");
	}
}

class RE extends Bike     //sub class2
{
	public  void start()
	{
		System.out.println("starts with self and kick");
	}
}

class HERO extends Bike      //sub class3
{
	public  void start()
	{
		System.out.println("starts with kick");
	}
}
class SCOOTY  extends Bike       //sub class4
{
	public  void start()
	{
		System.out.println("starts with kick and self ");
	}
}



public class TestDrive1 {
public static void main(String[] args) {
	
	KTM duke200  = new KTM();
	RE classic350 = new RE();
	HERO splenderplus = new HERO();
	SCOOTY zupitor = new SCOOTY();
	
	duke200.start();
	classic350.start();
	splenderplus.start();
	zupitor.start();
	
	
	
	
}
}
