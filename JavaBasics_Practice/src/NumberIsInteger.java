import java.util.Scanner;

public class NumberIsInteger {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner (System.in);
		boolean num = scr.hasNextInt();
		
		System.out.println(num);
		
		
	}

}
