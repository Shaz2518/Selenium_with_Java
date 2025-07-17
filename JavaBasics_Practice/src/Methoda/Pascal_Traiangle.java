package Methoda;

import java.util.Scanner;

public class Pascal_Traiangle {
	public static int Fact(int x)
	{
		int xFact =1;
		for(int i=1; i<=x; i++)
		{
			xFact *=i;
		}
		return xFact;
	}

	public static void main(String[] args) {
		System.out.println("Enter number of rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		for(int i=0; i<=rows; i++)
		{
			for(int j=1; j<=rows-i; j++)
			{
				System.out.print(" " + " ");
			}
			for(int j=0; j<=i;j++)
			{
				int pascalTriangle = Fact(i) / (Fact(j) * Fact(i-j));
				System.out.print(pascalTriangle + " " + " " + " ");
			}
			System.out.println();
			
		}
		
			
	}

}
