import java.util.Scanner;

public class PrimeOrComposite {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scr = new Scanner (System.in);
		int number = scr.nextInt();
		boolean flag = false; //By default the number is prime
		for (int i=2; i<number; i++)
		{
			if (number % i ==0)
			{
				flag = true; //Flag change to true for composite number;
				break;
			}
			
		}
		if(number == 1)
		{
			System.out.println("Neither Prime Nor Composite.");
		}
		else if (flag ==true)
		{
			System.out.println(number + " is Composite.");
		}
		else
			System.out.println(number + " is Prime");
	}

}
