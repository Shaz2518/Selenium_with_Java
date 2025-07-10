import java.util.Scanner;

public class RightSide_Triangle {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		/*  				1
		 * 				  1 2
		 * 				1 2 3
		 *  		  1 2 3 4
		 * 			1 2 3 4 5              
		 */
		for(int i=1; i<=rows ; i++)
		{
			for(int j= 2*rows-i; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(k + " ");
			}

			System.out.println();	
		}
		
	}

}
