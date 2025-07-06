//Find the highest factor of a number excluding the number Itself

import java.util.Scanner;

public class FactorOfNumber_Break {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scr = new Scanner (System.in);
		int number = scr.nextInt();
		int highestFactor=1;
		
		for (int i=number-1; i>1; i--)
		{
			if (number % i ==0)
			{
				highestFactor =i;
				break;
			}
		}
		System.out.println(highestFactor);
	}

}
