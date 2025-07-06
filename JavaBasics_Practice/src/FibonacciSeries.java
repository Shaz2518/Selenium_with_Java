import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		int a=0, b=1, c=0;;
		for (int i=0; i<=num; i++)
		{
			System.out.print(a + " ");
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
