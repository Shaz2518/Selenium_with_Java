import java.util.Scanner;

public class IfElse_IncomeTaxCalculate {

	public static void main(String[] args) {
		System.out.println("Enter your salary");
		Scanner scr = new Scanner (System.in);
		int Salary = scr.nextInt();
		
		if(Salary >= 250000 && Salary <= 500000)
		{
			System.out.println("Your Tax Slab is : 5%");
		}
		else if(Salary >= 500000 && Salary <= 1000000)
		{
			System.out.println("Your Tax Slab is : 10%");
		}
		else if(Salary >= 1000000)
		{
			System.out.println("Your Tax Slab is : 15%");
		}
		else
		{
			System.out.println("No Tax to be Paid");
		}
		scr.close();
	}

}
