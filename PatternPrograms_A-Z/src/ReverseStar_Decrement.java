import java.util.Scanner;

public class ReverseStar_Decrement {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		/* 1
		 * 2 1
		 * 3 2 1
		 * 4 3 2 1
		 * 5 4 3 2 1
		 */
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
/* ================================================================================*/
		/* 5 4 3 2 1
		 * 4 3 2 1
		 * 3 2 1
		 * 2 1 
		 * 1
		 */
		
		for(int i = rows; i>=1; i--)
		{
			for (int j=i; j>=1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
