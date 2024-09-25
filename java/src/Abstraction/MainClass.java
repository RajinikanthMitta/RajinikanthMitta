package Abstraction;

// super class contains 2 abstract methods
//complete the incomplee method in sub class


abstract class Work
{
	public abstract void startwork();
	public abstract void stopwork();
}

class Manager extends Work
{
	@Override
	public void startwork()
	{
		System.out.println("work started");
	}
	
	@Override
	public void stopwork()
	{
		System.out.println("work stopped");
	}	
}


public class MainClass {
public static void main(String[] args) {
	Manager m = new Manager();
		m.startwork();
		m.stopwork();
}
}
