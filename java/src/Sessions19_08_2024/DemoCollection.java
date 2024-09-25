package Sessions19_08_2024;

import java.util.ArrayList;

//arraylist program

public class DemoCollection {
public static void main(String[] args) {
	
	// declare the arraylist
	ArrayList al = new ArrayList();
	// add elements in arraylist
	
	al.add(100); // index 0
	al.add("java");// index 1
	al.add(12.5);// index 2
	
	System.out.println(al);
	//size
	System.out.println(al.size());
	
	//remove 1 element
	al.remove(1);
	System.out.println(al);
	
	// insert element
al.add(2, "core java");
System.out.println(al);

// retrive the specific element
al.get(1);
System.out.println(al.get(1));

// change element replace
al.set(1, "don");
System.out.println(al);

// search contains
System.out.println(al.contains("hero"));
System.out.println(al.contains("don"));

// isempty
System.out.println(al.isEmpty());

// we can reed the data by using for loop also
System.out.println("reading all elements");
for(int i=0; i<=al.size(); i++)
{
	System.out.println(al.get(i));
}











	
}
}
