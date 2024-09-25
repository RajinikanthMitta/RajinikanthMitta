package Sessions01_08_2024;


abstract class Work   // parent class
{
	public abstract void startwork();
	public abstract void stopwork();
}

class WokMen extends Work
{
	@Override
	public  void startwork() 
	{
		System.out.println("work started");
	}
	@Override
	public  void stopwork()
	{
		System.out.println("work stopped");
	}
	
}



public class DemoAbst {
	public static void main(String[] args) {
		
		WokMen w1 = new WokMen();
		
		w1.startwork();
		w1.stopwork();
		
		
		
	}

}
