import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int number = scr.nextInt();
		int product=1;
		while(number !=0)
		{
			int lastDigit = number % 10;
			product = product * lastDigit;
			number = number/10;
		}
		System.out.println(product);
	}

}
