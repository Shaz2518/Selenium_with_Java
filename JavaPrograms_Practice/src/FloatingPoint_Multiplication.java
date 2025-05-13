import java.util.Scanner;

public class FloatingPoint_Multiplication {

	public static void main(String[] args) {
		float num1, num2;
		System.out.println("Enter 2 floating point number");
		
		Scanner scr = new Scanner(System.in);
		num1 = scr.nextFloat();
		num2 = scr.nextFloat();
		
		float sum = num1 + num2;
		System.out.println("The Sum of 2 floating number is " + sum);
		
		scr.close();
		
	}

}
