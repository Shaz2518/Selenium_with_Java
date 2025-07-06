import java.util.Scanner;

public class Loops_GPSeries {

	public static void main(String[] args) {
		Scanner scr = new Scanner (System.in);
		System.out.println("Enter value of N");
		int n = scr.nextInt();
		System.out.println("Enter first term and comman ratio");
		int firstTerm = scr.nextInt();
		int comRatio = scr.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.println(firstTerm);
			firstTerm *=comRatio;
			
		}
	}

}
