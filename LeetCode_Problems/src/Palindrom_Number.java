import java.util.*;

public class Palindrom_Number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();

		int rev = 0, lastDigit = 0, temp = num;
		while (num != 0) {
			lastDigit = num % 10;
			rev = rev * 10 + lastDigit;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("Palindrom Number");
		} else
			System.out.println("Not a Palindrom Number");

	}
}
