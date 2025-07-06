import java.util.Scanner;

public class SwitchCase_DaysOfTheWeek {

	public static void main(String[] args) {
		System.out.println("Enter a Day Number");
		Scanner scr = new Scanner (System.in);
		int day_number = scr.nextInt();
		
		switch(day_number)
		{
		case 1 : System.out.println("Monday");
				break;
		case 2 : System.out.println("Tuesday");
		break;
		case 3 : System.out.println("Wednesday");
		break;
		case 4 : System.out.println("Thursday");
		break;
		case 5 : System.out.println("Friday");
		break;
		case 6 : System.out.println("Saturday");
		break;
		case 7 : System.out.println("Sunday");
		break;
		default : System.out.println("Enter a valid day number between 1-7");
		break;

		}
		 
		scr.close();
	}

}
