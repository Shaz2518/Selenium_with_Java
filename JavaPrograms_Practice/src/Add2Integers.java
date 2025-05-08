import java.util.Scanner;

public class Add2Integers {

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("Enter 2 Integer ");
		Scanner scr = new Scanner (System.in);
		num1 = scr.nextInt();
		num2 = scr.nextInt();
		
		int sum = num1 + num2;
		System.out.println ("Sum of 2 Integer is " + sum);
		
		scr.close();

	}

}
