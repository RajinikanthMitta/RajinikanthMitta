package Sessions19_08_2024;

import java.util.*;


public class Arraylist1 {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	
	al.add("A");
	al.add("E");
	al.add("D");
	al.add("B");
	al.add("C");
	
	ArrayList ad = new ArrayList();
	
	// add all
	ad.addAll(al);
	System.out.println(ad);
	
	// remove all
	ad.removeAll(al);
	System.out.println(ad);
	
	
	ArrayList collections;
	Collections.sort(al);
	System.out.println(al);
	
	Collections.sort(al, Collections.reverseOrder());
	System.out.println(al);
	
	Collections.shuffle(al);
	System.out.println(al);
	
	
}
}
