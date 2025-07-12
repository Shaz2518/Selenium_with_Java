import java.util.Scanner;

public class NSP_NST_Method {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		int nst = rows, nsp= 0;
		for(int i=1; i<=rows ; i++)
		{
			for(int j=1; j<=nsp; j++) 
			{
			System.out.print(" " +  " ");
			}
			for(int j=1; j<=nst; j++)
			{
				System.out.print("*" + " ");
			}
			nsp++;
			nst--;
			System.out.println();
		}
		
	}

}
