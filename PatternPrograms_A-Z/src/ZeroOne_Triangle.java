import java.util.Scanner;

public class ZeroOne_Triangle {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		/* 1
		 * 0 1
		 * 1 0 1
		 * 0 1 0 1
		 * 1 0 1 0
		 */
		// Method 1;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i % 2 !=0)
				{
					if(j % 2 !=0)
					{
						System.out.print(1 + " ");
					}
					else 
						System.out.print(0+ " ");
				}
				else 
					if(j % 2 ==0)
					{
						System.out.print(1 + " ");
					}
					else
						System.out.print(0 + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		//Method 2
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i % 2 !=0 && j % 2 !=0 || i % 2 ==0 && j % 2 == 0) {
					System.out.print(1 + " ");}
				else 
					System.out.print(0 + " ");
			}
			System.out.println();
		}
		System.out.println();
		//Method 3
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				
				if((i+j) %2 ==0) {
					System.out.print(1 + " ");}
				else 
					System.out.print(0 + " ");
			}
			System.out.println();
		}
	
	
		
	}
	

}
