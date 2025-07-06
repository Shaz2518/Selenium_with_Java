import java.util.Scanner;

public class FatorsOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Day Number");
		Scanner scr = new Scanner (System.in);
		int number = scr.nextInt();
		
		for (int i=1; i<=number; i++)
		{
			if (number % i ==0)
			{
				System.out.println(i);
			}
		}
	}

}
