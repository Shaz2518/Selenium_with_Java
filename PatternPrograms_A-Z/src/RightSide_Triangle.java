import java.util.Scanner;

public class RightSide_Triangle {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		/*  				*
		 * 				  * *
		 * 				* * *
		 *  		  * * * *
		 * 			* * * * *              
		 */
		for(int i=1; i<=rows ; i++)
		{
			for(int j= 1; j<=rows-i; j++)
			{
				System.out.print(" " + " ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*" + " ");
			}

			System.out.println();	
		}
		System.out.println();
		
		/*          A
		 *        A B
		 *      A B C
		 *    A B C D
		 *  A B C D E 
		*/
		for(int i=1;i<=rows; i++)
		{
			for(int j=1; j<=rows-i; j++)
			{
				System.out.print(" " + " ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print((char)(k+64) + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		/*           1
		 *         1 2
		 *       1 2 3
		 *     1 2 3 4
		 *   1 2 3 4 5      
		 */
		
		for(int i=1; i<=rows; i++)
		{
			for(int j =1; j<=rows-i; j++)
			{
				System.out.print(" " + " ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		

	}

}
