package Sessions22_07_2024;

import ForLoop.SumSeries;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int num=153;
		int copy=num;
		int original=num;
		int digit,count=0;
		int sum=0;
		
		do
		{
			digit=num%10;  //fetching the digit at time
			count++;   // no. of digits stored in count at the end
			num=num/10;   //remove the last digit and fetch remaining
		}
		while(num!=0);
		
		do 
		{
			digit=copy%10;
			sum+=Math.pow(digit, count);

			copy=copy/10;
		}
		
		while(copy!=0);
	
	if(sum==original)
	{
		System.out.println("it is amstrong number");
	}
	
	else
	{
		System.out.println("it is not a amstrong number");
	}
	
}}
