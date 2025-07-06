import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		Scanner scr = new Scanner (System.in);
		System.out.println("Enter a table to be printed");
		
		int number = scr.nextInt();		
		for(int i=1; i<=10;i++)
		{
			System.out.println(i*number);
		}
	}

}
