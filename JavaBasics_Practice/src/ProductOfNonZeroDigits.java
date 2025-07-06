import java.util.Scanner;

public class ProductOfNonZeroDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		
		int product=1;
		while(num!=0)
		{
				int lastDigit = num % 10;
				if(lastDigit!=0)
				{
				product = product * lastDigit;
				}
				num = num/10;
			
		}
		System.out.println(product);
			
		
	}

}
