import java.util.Scanner;

public class ConvertToLowerCase {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner scr = new Scanner (System.in);
		String name = scr.next();
		
		//To Lower Case
		System.out.println(name.toLowerCase());
		
		//Replace space with underscore
		String str = "Shaziya Shaikh is an SDET";
		System.out.println(str.replace(" ", "_"));
		
		//Replace template with Name
		String letter = "Dear <|name|>, Thanks alot";
		System.out.println(letter.replace("<|name|>",name));
		
		scr.close();
	}

}
