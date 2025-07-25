package Strings;

import java.util.*;

public class Palindromic_String {
	public static boolean isPalindrom(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			rev += ch;
		}
		if (rev.equals(s))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		String str = "madam";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String sub = str.substring(i, j);
				boolean ans = isPalindrom(sub);
				if (ans == true) {
					System.out.print(sub + " ");
					count++;
				}
			}
		}
		System.out.println("\n The number of palindromic Substring is: " + count);
		
	}
	
}
