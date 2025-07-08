import java.util.Scanner;

public class AlpahNumeric_Triangle {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2 ==0)
				{
					System.out.print((char)(j+64) + " ");
				}
				else
					System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
