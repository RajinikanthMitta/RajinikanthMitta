package Numbers;

public class Polindrome {

public static void main(String[]args) {
	
	int num=282;
	int copy = num;
	int digit, reverse =0;
	
	do
	{
		digit =num %10;
		reverse = (reverse*10)+digit;
		num = num/10;
	}
while(num!=0);
	
	if(reverse == copy)
	{
		System.out.println(copy+" is polindrome");
	}
	else
	{
		System.out.println(copy+" is not polindrome");
	}
	
	
	
	
	
}	
	
}
