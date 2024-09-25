package Sessions13_08_2024;

public class WrapperClass {
public static void main(String[] args) {
	
	// conversion of primitive data type to wrapper class object=----Autoboxing

	//1. using new kyword
	
	Integer i1= new Integer(10);
	System.out.println(i1);
	
	
	// 2. by using value of()
	
	Integer i2 = Integer.valueOf(20);
	System.out.println(i2);
	
	
	// 3. by using directly
	
	Integer i3 = 30;
	System.out.println(i3);
	
	
	// conversion of wrapper class object to primitive type variable --- unboxing
	
	//1. by using directly
	
	Integer i =40; // wco
	
	int x=i;
	System.out.println(x);
	
	// 2. using value()
	
	Integer t =50; // wco
	
	int y = t.intValue();
	
	System.out.println(y);
	
	
}
}
