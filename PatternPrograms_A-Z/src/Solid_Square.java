import java.util.Scanner;

public class Solid_Square {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}

}
