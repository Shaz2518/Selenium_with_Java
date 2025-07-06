import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scr = new Scanner (System.in);
		int number = scr.nextInt();
		
		int temp=0, sum=0;
		while(number!=0)
		{
			temp = number%10;
			sum = sum + temp;
			number= number/10;
		}
		System.out.println(sum);
		
	}

}
