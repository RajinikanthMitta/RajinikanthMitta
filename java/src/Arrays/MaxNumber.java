package Arrays;

public class MaxNumber {
public static void main(String[] args) {
	
	 int numbers[] = {34, 43, 54, 65, 23};
     int max = numbers[0];

     for (int i = 1; i < numbers.length; i++) 
     {
         if (numbers[i] > max) 
         {
             max = numbers[i];
         }
     }
     
     System.out.println("The maximum number is: " + max);
 }	
}










