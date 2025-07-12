import java.util.Scanner;

public class Star_Diamond {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner scr = new Scanner(System.in);
		int rows = scr.nextInt();
		
		int nsp= rows-1, nst = 1;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=nsp; j++)
			{
				System.out.print(" " + " ");
			}
			for(int j=1; j<=nst; j++)
			{
				System.out.print("*" + " ");
			}
			nsp--;
			nst+=2;
			System.out.println();
		 }
		 	nsp= 1;
		    nst =2*rows -3 ;
			for(int i=1; i<=rows-1; i++)
			{
				for(int j=1;j<=nsp; j++)
			{
				System.out.print(" " + " ");
			}
			for(int j=1; j<=nst; j++)
			{
				System.out.print("*" + " ");
			}
			nsp++;
			nst -=2;
			System.out.println();
			}
	}

}
