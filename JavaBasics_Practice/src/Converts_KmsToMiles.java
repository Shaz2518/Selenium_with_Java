import java.util.Scanner;

public class Converts_KmsToMiles {

	public static void main(String[] args) {
		System.out.println("Enter Kilometers");
		Scanner scr = new Scanner (System.in);
		double kilometers = scr.nextDouble();
		double miles = kilometers * 0.621371;
		System.out.println("Kilometer converted to miles: " + miles);
		scr.close();
	}
}
