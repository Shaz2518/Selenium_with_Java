import java.util.Scanner;

public class HollowRectangle_Pattern {

	public static void main(String[] args) {
		System.out.println("Enter rows and Cols for rectangle");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		int cols = scr.nextInt();
		
		/* * * * * *
		 * *       *
		 * *	   *
		 * * * * * *
		 */
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				if( i==1 || i==rows || j==1 || j==cols)
				System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

}
