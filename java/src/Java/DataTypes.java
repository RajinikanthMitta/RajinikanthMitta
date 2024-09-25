package Java;

public class DataTypes {
public static void main(String[] args) {
	
	int a = 3;
	Long d= 53535356764657L;
	Short s = -32768;			//-321768 to 32767
	Byte by = -128;				//-128 to 127
	
	
	//real numbers
	double b = 4.123456789123456;		// Upto 16 digits include decimal point
	Float c = 3.1234567F;				// Upto 8 digits include decimal point
	
	
	// non numeric
	char ch = 'Z';
	String st = "Rajinikanth";  	// this is the non primitive
	boolean B = true;
	
	
	System.out.println(a);
	System.out.println(d); 
	System.out.println(s);
	System.out.println(by);
	
	System.out.println(b);
	System.out.println(c);

	
	System.out.println(ch);
	
	System.out.println(st);
	System.out.println(B);
	
	System.out.println(10==5);
	System.out.println(10!=5);
	
}
}
