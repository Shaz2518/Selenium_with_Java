package Methoda;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers");
		Scanner scr = new Scanner(System.in);
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();
		int num3 = scr.nextInt();
		
		//Method- 1
		int max1 = Math.max(num1, num2);
		int max2 = Math.max(max1, num3);
		
		System.out.println("Max: " + max2);
		
		//Method - 2
		System.out.println(Math.max(num1, Math.max(num2, num3)));
	}

}
