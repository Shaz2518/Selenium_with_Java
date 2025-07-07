import java.util.Scanner;

public class Solid_Rectangle {

	public static void main(String[] args) {
		Scanner scr = new Scanner (System.in);
		System.out.println("Enter number rows and cols");
		int rows = scr.nextInt();
		int cols = scr.nextInt();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
