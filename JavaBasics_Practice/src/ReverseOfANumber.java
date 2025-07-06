import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner (System.in);
		int num = scr.nextInt();
		int rev =0, lastDigit=0;
		while (num !=0)
		{
			lastDigit = num %10;
			rev = rev * 10 + lastDigit;
			num = num / 10;
		}
		System.out.println(rev);
	}

}
