import java.util.Scanner;

public class IsGreater {

	public static void main(String[] args) {
		int number =43;
		System.out.println("Enter a number");
		Scanner scr = new Scanner (System.in);
		int user_number = scr.nextInt();
		
		if(user_number > number)
		System.out.println("User number is greater");
		else
		{
			System.out.println("User number is  NOT greater");
		}
		
		scr.close();
	}

}
