import java.util.Scanner;

public class IfElse_LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter a Year");
		Scanner scr = new Scanner (System.in);
		int year = scr.nextInt();
		
		if(year%4==0 || year%100==0 || year%400==0)
		{
			System.out.println(year + " " + "Its a Leap Year");
		}
		else
			System.out.println(year + " " + "Its NOT a Leap Year");
	
		scr.close();	
	}
}
