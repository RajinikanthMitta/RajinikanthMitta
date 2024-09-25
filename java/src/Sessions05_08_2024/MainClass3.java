package Sessions05_08_2024;
// super class contains 2 abstract methods
// complete the incomplete methods in sub classes


abstract class Work  // parent class

{
	public abstract void startwork();
	public abstract void stopwork();
	
}
class WorkMen extends Work   // child class
{
	@Override
	public void startwork()
	{
		System.out.println("work started");
	}
	@Override
	public  void stopwork()
	{
		System.out.println("work stopped");
	}
}


public class MainClass3 {
public static void main(String[] args) {
	
	WorkMen w = new WorkMen();
	w.startwork();
	w.stopwork();
	
}
}
