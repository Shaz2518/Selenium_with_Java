import java.util.Scanner;

public class Star_RightTriangle {

	public static void main(String[] args) {
		System.out.println("Enter a row");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		// * 
		// * *
		// * * *
		// * * * *
		// * * * * *
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println();
/* ==========================================================================*/		
		 /* 1 
		  * 1 2
		  * 1 2 3
		  * 1 2 3 4
		  * 1 2 3 4 5
		  */
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
/* ==========================================================================*/	
		/* 1
		 * 2 2
		 * 3 3 3
		 * 4 4 4 4
		 * 5 5 5 5 5
		 */
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();
/* ==========================================================================*/			
		/* A
		 * A B
		 * A B C
		 * A B C D
		 * A B C D E
		 */
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(j+64) + " ");
			}
			System.out.println();
		}
		System.out.println();
/* ==========================================================================*/	
	  /* A
	   * B B
	   * C C C
	   * D D D D
	   * E E E E E
	   */
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(i+64) + " ");
			}
			System.out.println();
		}
		System.out.println();
/* ==========================================================================*/
	
	}
	
	

}
