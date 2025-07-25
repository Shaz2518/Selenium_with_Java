package Strings;

import java.util.Scanner;

public class StringBuilder_Toggle {

	public static void main(String[] args) {
		
		//Take String from User
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a String");
		StringBuilder str = new StringBuilder(scr.nextLine());
		System.out.println("String entered is: " + str);
		
		//Traverse through String
		for(int i=0; i<str.length(); i++)
		{
			boolean flag = true;  //Capital;
			char ch = str.charAt(i);
			
			if(ch == ' ') continue; //Ignores Space
			int ascii = (int)ch;
			if(ch<65  || ch>124) continue; //Ignores Integer
			
			
			//Toggle
			if(ch>=97) flag = false; 
			if(flag==true)
			{
				ascii +=32;  //Add Ascii 
				char chr = (char)ascii;
				str.setCharAt(i, chr);
			}
			else {
				ascii -=32;
				char chr = (char)ascii;
				str.setCharAt(i, chr);
			}
		}
		System.out.println("Toggle String: " + str);

	}

}
