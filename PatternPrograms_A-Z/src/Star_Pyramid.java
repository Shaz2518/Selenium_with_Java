import java.util.Scanner;

public class Star_Pyramid {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		/*          *
		 *        * * *
		 *      * * * * *
		 *    * * * * * * *
		 *  * * * * * * * * *  
		 */
		//Method 1 - 3 loops
		for (int i=1; i<=rows; i++)
		{
			for (int j= 1; j<=rows-i; j++)
			{
				System.out.print(" " + " ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*" + " ");
			}
			for(int m=2; m<=i; m++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
			
		}
		System.out.println();
		//Method 2- Printing like AP
		for(int i=1; i<=rows; i++)
		{
			for (int j= 1; j<=rows-i; j++)
			{
				System.out.print(" " + " ");
			}
			for(int j=1; j<=2*i-1; j++)
			{
				System.out.print((char)(j+64) + " ");
			}
			System.out.println();
			
		}
	}

}
