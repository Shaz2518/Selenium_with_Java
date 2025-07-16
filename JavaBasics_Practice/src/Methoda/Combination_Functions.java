package Methoda;

import java.util.Scanner;

public class Combination_Functions {

	public static void main(String[] args) {
		System.out.println("Enter value of n and r");
		Scanner scr = new Scanner(System.in);
		int n= scr.nextInt();
		int r= scr.nextInt();
		
		int nFact = 1;
		for(int i=1; i<=n; i++)
		{
			nFact *= i;
		}
		
		int rFact =1;
		for(int i=1; i<=r; i++)
		{
			rFact *=i;
		}
		
		int n_rFact =1;
		for(int i=1; i<=n-r; i++)
		{
			n_rFact *=i;
		}
		
		int ncr = nFact / (rFact*n_rFact);
		System.out.println(ncr);
		
		scr.close();

	}
	

}
