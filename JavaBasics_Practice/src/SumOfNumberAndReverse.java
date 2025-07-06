import java.util.Scanner;

public class SumOfNumberAndReverse {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner (System.in);
		int num = scr.nextInt();
		int rev=0, sum=0, temp = num;
		while (temp !=0)
		{
			int lastDigit = temp % 10;
			rev = rev * 10 + lastDigit;
			temp = temp /10;
		}
		System.out.println(rev + num);
	}

}
