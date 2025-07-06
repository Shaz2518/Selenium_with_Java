import java.util.Scanner;

public class IfElse_StudentPassOrFail {

	public static void main(String[] args) {
		System.out.println("Enter name of a Student");
		Scanner scr = new Scanner(System.in);
		String name = scr.next();
		
		System.out.println("Enter marks of 3 subjects");
		double sub1= scr.nextDouble();
		double sub2 = scr.nextDouble();
		double sub3 = scr.nextDouble();
		
		double percent = ((sub1 + sub2 + sub3)/300) * 100;
		System.out.println("Your percentage is: " + percent);
		if(percent >=40 || sub1 >=33 || sub2 >=33 || sub3 >=33)
		{
			System.out.println("Congratulations! " + name + " " + "You are Pass!");
		}
		else
		{
			System.out.println("You are Fail. " + "Better Luck Next Time");
		}
		
		scr.close();
	}

}
