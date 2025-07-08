import java.util.Scanner;

public class ReverseStar_Traingle {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = scr.nextInt();
		
		/* 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2
		 * 1
		 */
		
		for(int i=rows; i>=0; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	/* =================================================================================*/
		/* 1 1 1 1 1
		 * 2 2 2 2
		 * 3 3 3
		 * 4 4
		 * 5
		 */
		
		for(int i=rows; i>=0; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	/* =================================================================================*/
		/* 5
		 * 5 4
		 * 5 4 3
		 * 5 4 3 2
		 * 5 4 3 2 1
		 */
		
		for(int i=rows; i>=1; i--)
		{
			for(int j=rows; j>=i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	
	}

}
