package Methoda;

import java.util.Scanner;

public class Combination_Methods {

	public static void main(String[] args) {
		System.out.println("Enter a value for n and r");
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int r = scr.nextInt();
		
		int ncr = fact(n) / (fact(r)*fact(n-r));
		System.out.println("Combination of 2 number is: " + ncr);
	}
	
	public static int fact(int x)
	{
		int xFact =1;
		for(int i=1; i<=x; i++)
		{
			xFact *=i;
		}
		return xFact;
	}
	

}
