package Sessions06_08_2024;


class Encapsulation2
{
	private String name;
	public void setname (String name)
	{
		this.name=name;
	}

public String getname()
{
	return name;
}
}

public class MainClass2 {
public static void main(String[] args) {
	Encapsulation2 e1 = new Encapsulation2();
	e1.setname("core java");
	System.out.println("name: " +e1.getname());
}
}
