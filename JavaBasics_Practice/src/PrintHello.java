import java.util.Scanner;

public class PrintHello {

	public static void main(String[] args) {
		System.out.println("Enter your name");
		Scanner scr = new Scanner (System.in);
		String name = scr.next();
		
		System.out.println("Hello " + name + " " + "Have a nice Day..!!");
		
		
	}

}
