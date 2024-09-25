package Encapsulation;

  class Class {

	private int month ;
	void setmonth(int month)
	{
		if(month>=1 && month<=12)
		{
			this.month=month;
		}
		
		else
		{
			System.out.println("kindly enter valid month");
		}
	}	
	public int getmonth()
	{
		return month;
	}
  }
		
		public class MainClass
		{
			public static void main(String[] args) 
			{
				Class c1 = new Class();
				c1.setmonth(6);
				System.out.println(c1.getmonth());
			}
		
		}	

