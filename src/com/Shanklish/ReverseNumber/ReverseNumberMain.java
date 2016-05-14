package com.Shanklish.ReverseNumber;
import java.util.Scanner;

public class ReverseNumberMain {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number that you would like to be reversed.");
		int input = scan.nextInt();		
		
		// Dividing the number by 10 during every loop. The remainder of the first loop will
	   // be added to the remainder of the next loop after it has been multiplied by 10.
		int result = 0;
		
		while (input != 0)
		{
			int remainder = 0;
						
			remainder = input % 10;
			
			input = input / 10;
			
			result = result * 10 + remainder;						
		}
		
		System.out.println("Your number reversed is " + result);
	}

}

