package Java.ConstructorOverLoading;

 class D1
 {
    D1()
    {
        this(10);
        System.out.println("non");
    }

    D1(int x) 
    {
        this("java");
        System.out.println("int");
    }

    D1(String y) 
    {
    	
        System.out.println("string");
    }
}

public class Demo {
	
    public static void main(String[] args) {
    	
        D1 d = new D1();
         
    }
}