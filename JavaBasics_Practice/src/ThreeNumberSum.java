import java.util.Scanner;

public class ThreeNumberSum {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers: ");
		Scanner scr = new Scanner (System.in);
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();
		int num3 = scr.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println("Sum of 3 numbers are: " + sum);
	}

}
