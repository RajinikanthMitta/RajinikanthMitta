package Java.ConstructorOverLoading;

public class Account {

	String name;
	Long mobile;
	Long adhar;
	String pan;
	
	Account (String name)
	{
		this.name=name;
	}
	Account (String name,Long mobile)
	{
		this.name=name;
		this.mobile=mobile;
	}
	Account (String name,Long mobile,Long adhar)
	{
		this.name=name;
		this.mobile=mobile;
		this.adhar=adhar;
	}
	Account (String name,Long mobile,Long adhar,String pan)
	{
		this.name=name;
		this.mobile=mobile;
		this.adhar=adhar;
		this.pan=pan;
	}
	
	public void display()
	{
	System.out.println("name of a/c holder:"+name);
	System.out.println("mobile no:"+mobile);
	System.out.println("adhar no:"+adhar);
	System.out.println("pan no:"+pan);
	}
	
public static void main(String[] args) {
	Account a1 = new Account("rajini");
	a1.display();
	Account a2 = new Account("rajini",9948202463L);
	a2.display();
	Account a3 = new Account("rajini",9948202463L,218698817881L);
	a3.display();
	Account a4 = new Account("rajini",9948202463L,218698817881L,"25RE652 ");
	a4.display();

}
	
}
