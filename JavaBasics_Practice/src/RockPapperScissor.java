import java.util.Random;
import java.util.Scanner;

public class RockPapperScissor {

	public static void main(String[] args) {
		System.out.println("Enter your choice (0.rock/ 1.paper/ 2.scissor)");
		Scanner scr = new Scanner(System.in);
		int userMove = scr.nextInt();
		
		Random random = new Random();
		int computerMove = random.nextInt(3);
		
		System.out.println ("User Move: " + userMove + "!");
		System.out.println ("Computer Move: " + computerMove + "!");
		
		
		if(computerMove == userMove)
		{
			System.out.println("Match Draw");
		}
		else if(userMove==0 && computerMove==2 || userMove==1 && computerMove==0
				|| userMove==2 && computerMove==1)
		{
			System.out.println("User Wins");
		}
		else
			System.out.println("Computer Wins: " + computerMove );
	
		scr.close();
	}
	
	
}
