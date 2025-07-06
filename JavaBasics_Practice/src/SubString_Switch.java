import java.util.Scanner;

public class SubString_Switch {

	public static void main(String[] args) {
		System.out.println("Enter website name:");
		Scanner scr = new Scanner (System.in);
		String URL = scr.next();
		
		int index = URL.indexOf('.');
		System.out.println(index);
		
		String domain = URL.substring(index);
		System.out.println(domain);
		
		switch(domain)
		{
			case ".com":System.out.println("Its a Commercial Website");
					break;
			case ".org":System.out.println("Its an Organizational Website");
					break;
			case ".in":System.out.println("Its an Indian Website");
					break;
			default :System.out.println("Enter a valid URL with domain name");
					break;

		}
		
		scr.close();
	}

}
