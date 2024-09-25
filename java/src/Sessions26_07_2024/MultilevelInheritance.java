package Sessions26_07_2024;


class Animal     // parent  class
{
void eat()
{
	System.out.println("eating..");
}
}


class Dog extends Animal  // sub class acts as as parent class as well as child class
{
	void bark()
	{
		System.out.println("barking...");
		
	}
}

class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("weeping..");
	}
}



public class MultilevelInheritance {
public static void main(String[] args) {
	
	BabyDog d = new BabyDog();
	d.eat();
	d.bark();
	d.weep();
	
	
	
}
}
