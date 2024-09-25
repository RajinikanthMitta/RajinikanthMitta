package Numbers;

public class Factor {
public static void main(String[] args) {
	
	int num =5;
	int count = 0;
	
	System.out.println("factor of" +num+" are");
	
	for(int i=1; i<=5; i++)
{
	if(num%i==0)
	{
	System.out.println(i+" ");	
	count++;
	}	
}
	
	System.out.println("no. of factors of"+num+ "=" +count );
}
}
