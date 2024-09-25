package scanner;

import java.util.Scanner;

import io.opentelemetry.sdk.metrics.data.SumData;

public class Demo2 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("arithmetic operations");

		
		System.out.println("enter 1st value:");
		int a=scan.nextInt();

		System.out.println("enter 2nd value:");
		int b=scan.nextInt();
		
		System.out.println("enter 3rd value:");
		int c=scan.nextInt();
		
		int	Sum = a+b+c;
		System.out.println("sum of a+b+c:" +Sum);
		
		
}
}