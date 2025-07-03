import java.util.Scanner;

public class AverageOfThreeSubjects {

	public static void main(String[] args) {
		System.out.println("Enter marks for 3 subjects");
		Scanner scr = new Scanner (System.in);
		int subj_1 = scr.nextInt();
		int subj_2 = scr.nextInt();
		int subj_3 = scr.nextInt();
		
		
		int sum = subj_1 + subj_2 + subj_3;
		int avg = (sum/3);
		
		System.out.println("Average of 3 subject: " + avg);
		
	}

}
