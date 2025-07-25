package Strings;

public class Reverse_Word_in_String {

	public static void main(String[] args) {
		String str = "I am an online educator";
		String ans = "";
		
		StringBuilder last = new StringBuilder("");

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch != ' ') 
			{
				last.append(ch);
				
			}
			else
			{
				last.reverse();
				ans += last;
				ans += " ";
				last = new StringBuilder();
			}
					
		}
		last.reverse();
		System.out.println(ans + last);
	
		

	}

}
