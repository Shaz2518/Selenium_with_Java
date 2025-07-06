import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(i + " ");
			}
		}
	}

}
