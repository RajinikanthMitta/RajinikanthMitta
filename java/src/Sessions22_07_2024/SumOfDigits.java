package Sessions22_07_2024;

public class SumOfDigits {
public static void main(String[] args) {
	int num=436;
	int digit, sum=0;
	
	
	do
	{
		digit= num%10;
		sum=sum+digit;
		num=num/10;
	}
	while(num!=0);
	System.out.println("sum og digits : "+sum);
}
}
