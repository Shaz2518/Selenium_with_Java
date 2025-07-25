package Strings;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scr.nextLine();
		String rev = "";
	
		//Reverse a String
		String lower = str.toLowerCase();
		for(int i=str.length()-1; i>=0; i--)
		{
			char ch = lower.charAt(i);
			rev +=ch;
		}
		System.out.println(rev);
		 
		//Check if Palindrom
		
		if(lower.equals(rev))
		{
			System.out.println("Palindrom");
		}
		else
			System.out.println("Not Palindrom");
		
		

	}

}
