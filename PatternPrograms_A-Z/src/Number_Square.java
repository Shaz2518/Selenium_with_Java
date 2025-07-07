import java.util.Scanner;

public class Number_Square {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		/* 1 2 3 4
		   1 2 3 4
		   1 2 3 4
		   1 2 3 4 */
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		/* 1 1 1 1
		   2 2 2 2
		   3 3 3 3
		   4 4 4 4 */
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}

}
