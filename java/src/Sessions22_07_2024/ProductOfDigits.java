package Sessions22_07_2024;

public class ProductOfDigits {
public static void main(String[] args) {
	
	
	
	int num =526;
	int digit, product=1;
	
	do
	{
		digit= num%10;
				product = product*digit;
				num=num/10;
	}
	while(num!=0);
	{
		System.out.println("product of digits:" +product);
	}
}
}
