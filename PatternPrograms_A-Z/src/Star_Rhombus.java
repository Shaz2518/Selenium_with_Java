import java.util.Scanner;

public class Star_Rhombus {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		/*        * * * *
		 *     * * * *
		    * * * *
		  * * * * 
		 */
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows-i; j++)
			{
				System.out.print(" " + " ");
			}
			for(int k=1; k<=rows; k++)
			{
				System.out.print("*"+ " ");
			}  
			
		
		//for (int m=rows-1;m>=i;m--)
			//{
				//System.out.print("*" + " ");
			//}
		System.out.println();	
		}
		
	}
	
}
