import java.util.Scanner;

public class FactorialOfNuber {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scr = new Scanner (System.in);
		int num = scr.nextInt();
		int fact =1;
		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
			System.out.println("Factorial of " + i + " is " + fact);
		}
		//System.out.println(fact);
	}

}
