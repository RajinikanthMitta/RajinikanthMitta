package Sessions05_08_2024;


 abstract class Bike   //parent class
 {
	 public abstract  void start();
 }

class KTM extends Bike    // sub class1
{
	public void start()
	{
		System.out.println("selft start");
	}
}
 class RE extends Bike     // sub class2
 {
	 public void start()
	 {
		 System.out.println("start with kick and self");
	 }
 }
 
class Hero extends Bike     // sub class3
{
	public void start()
	{
		System.out.println("start with kick only");
	}
}

class Scooty extends Bike     // sub class4
{
	public void start()
	{
		System.out.println("start with self and kick also");
	}
}



public class TestDrive2 {

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
