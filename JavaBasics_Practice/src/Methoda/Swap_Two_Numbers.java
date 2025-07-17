package Methoda;

import java.util.Scanner;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner scr = new Scanner(System.in);
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();
		
		//With temp 
		System.out.println("Before Swap: " + num1 + " " + num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swap: " + num1 + " " + num2);
		System.out.println("*******************");
		
		// Without Temp
		System.out.println("Before Swap: " + num1 + " " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After Swap: " + num1 + " " + num2);

	}

}
