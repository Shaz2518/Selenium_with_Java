import java.util.Scanner;

public class ReadInput_fromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		
		System.out.println("The number entered is: " + num);
		scr.close();
		

	}

}
