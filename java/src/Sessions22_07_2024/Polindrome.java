package Sessions22_07_2024;

public class Polindrome {
public static void main(String[] args) {
	
	
	
	
	int num =125;
	int copy=num;
	int digit, reverse=0;
	
	do
	{
		digit= num%10;
				reverse=(reverse*10)+digit;
				num=num/10;
	}
	while (num!=0);
	
	if(reverse==copy)
	{
		System.out.println("it is polindrome number");
	}
	else
	{
		System.out.println("it is not a polindrome number");
	}
}
}
