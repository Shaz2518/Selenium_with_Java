import java.util.Scanner;

public class IncrementDecrement_Triangle {

	public static void main(String[] args) {
		System.out.println("Enter a rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		/* 1
		 * 1 2 1
		 * 1 2 3 2 1
		 * 1 2 3 4 3 2 1
		 * 1 2 3 4 5 4 3 2 1
		 */ 
		 
		// Left Part
		for(int i=1; i<=rows; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			for (int m = i-1; m>=1; m--)
			{
				System.out.print(m + " ");
			}
			System.out.println();
		}
		
		//Right part
		
		
		
	}

}
