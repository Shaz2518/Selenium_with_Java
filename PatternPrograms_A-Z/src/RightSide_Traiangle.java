import java.util.Scanner;

public class RightSide_Traiangle {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		/*         *
		 *       * *
		 *     * * *
		 *   * * * *
		 * * * * * *     
		 */
		
		for(int i=1; i<= rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if((i+j) <=rows)
				System.out.print(" " + " ");
				else
					System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
