package IfElse;
//  character is upper case or not


public class CharacterDemo {
public static void main(String[] args) {
	
	Character ch= 'z';
	if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')) // declare the letter
	{
		if(ch>='a'&& ch<='z')
		{
		System.out.println(ch+ " is lower case letter");
		}
		else
		{
		System.out.println(ch+ " is upper case letter");
		}
	}	
		else 	
		 {
		System.out.println("kindly enter letter");
		 }	
	
}
}
