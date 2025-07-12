import java.util.Scanner;

public class StarPlus_Pattern {

	public static void main(String[] args) {
		System.out.println("Enter row number, Rows number should be odd");
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int mid = n/2 +1;
		System.out.println("Value of mid: " + mid);
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i == mid || j == mid)
				System.out.print("* ");
				else System.out.print("  ");
			}
			
			System.out.println();
		}
	}

}
