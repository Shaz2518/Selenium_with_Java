import java.util.Scanner;

public class Alphabet_Square {
	public static void main (String arg[])
	{
		System.out.println("Enter a Character");
		Scanner scr = new Scanner(System.in);
		
		int rows = scr.nextInt();
		for(int i=1; i<=rows; i++)
		{
			for(int j=65; j>=65; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
