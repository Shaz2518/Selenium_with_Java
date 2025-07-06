import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scr = new Scanner (System.in);
		int number = scr.nextInt();
		
		int count=0;
		if(number == 0)
			count++;
		while (number !=0)
		{
			number = number / 10;
			count++;
		}
		System.out.println(count);
	}

}
