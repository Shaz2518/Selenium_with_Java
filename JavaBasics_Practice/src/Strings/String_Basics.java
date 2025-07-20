package Strings;

public class String_Basics {

	public static void main(String[] args) {
//		String str = "Physics";
//		for (int j = 2; j < 4; j++) {
//			System.out.print(str.substring(j));
//		}

		// Print all substring
		String strng = "abcd";
		for (int i = 0; i <= 3; i++) {
			for (int j = i + 1; j <= 4; j++) {
				System.out.print(strng.substring(i, j) + " ");
			}
		}

	}

}
