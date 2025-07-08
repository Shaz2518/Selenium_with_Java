import java.util.Scanner;

public class HalfPyramid_Increment {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		/* 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 */
		
		// First half
		for(int i=rows; i>0; i--)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int m = 2; m<=rows; m++)
		{
			for(int k=1; k<=m; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		scr.close();
		
	}

}
