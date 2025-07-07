import java.util.Scanner;

public class Alphabet_Square {
	public static void main (String arg[])
	{
		System.out.println("Enter a Character");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		/* A B C D
		 * A B C D
		 * A B C D
		 * A B C D
		 */
		for(int i=1; i<=rows; i++)
		{
			for(int j=1;j<=rows; j++)
			{
				System.out.print((char)(j+64) + " ");
			}
			System.out.println();
		}
		
	}

}
