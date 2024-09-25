package Numbers;


// whenever we don't know about no. of executions to be done, we choose do while loop

public class AmstrongNumber {
public static void main(String[] args) {
	
	int num = 153;
	int copy = num;
	int original= num;
	int digit, count=0;
	int sum=0;
	
	do
	{
		digit = num%10;
		count++;
		num= num/10;
	}
	while(num!=0);

	do
	{
		digit = copy%10;
		sum+=Math.pow(digit, count);
		copy= copy/10;
	}
	while (copy!=0);
	
	if(sum==original)
	{
		System.out.println("is amstrong number");
	}
	
	else
	{
		System.out.println("is not amstrong number");
	}
	
	
	
	
}
}
