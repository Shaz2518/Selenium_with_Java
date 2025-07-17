package Methoda;

import java.util.Scanner;

public class Permutation_Methods {

	public static void main(String[] args) {
		System.out.println("Enter the value on n and r");
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int r = scr.nextInt();
		
		int npr = fact(n) / (fact(n-r));
		System.out.println("Permutation is: " + npr);
	}
	
	public static int fact(int x)
	{
		int xFact = 1;
		for (int i=1; i<=x; i++)
		{
			xFact *=i;
		}
		return xFact;
	}

}
