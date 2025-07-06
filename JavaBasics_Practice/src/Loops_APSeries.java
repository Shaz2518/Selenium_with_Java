import java.util.Scanner;

public class Loops_APSeries {

	public static void main(String[] args) {
		Scanner scr = new Scanner (System.in);
		System.out.println("Enter value of N");
		int n = scr.nextInt();
		System.out.println("Enter first term and comman difference");
		int firstTerm = scr.nextInt();
		int comDiff = scr.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.println(firstTerm);
			firstTerm +=comDiff;
			
		}
	}

}
