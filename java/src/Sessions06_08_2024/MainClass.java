package Sessions06_08_2024;


class Encapsulation1 {
	private int month;
	public void setmonth (int month)
	{
		if (month >=1 && month<=12)
		{
			this.month= month;
		}
		else {
			System.out.println("kindly enter the month");
		}
	}
	
	public int getmonth()
	{
		return month;
	}
	
	
}

public class MainClass {
public static void main(String[] args) {

	Encapsulation1 e = new Encapsulation1();
	e.setmonth(8);
	System.out.println(e.getmonth());
	
}
}
