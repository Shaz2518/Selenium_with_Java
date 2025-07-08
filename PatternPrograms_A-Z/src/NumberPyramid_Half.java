import java.util.Scanner;

public class NumberPyramid_Half {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		/* 1
		 * 1 2
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2
		 * 1
		 */
		for(int i =1; i<=rows; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();	
		}
		for (int m=rows-1; m>=1; m--)
		{
			for(int n = 1; n<=m; n++)
			{
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
