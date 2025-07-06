
public class GradeConversion {

	public static void main(String[] args) {
		char grade = 'C';
		grade = (char)(grade + 8);
		System.out.println("Encrypted Grade: " + grade);
		
		//Decrypt Grade
		grade = (char)(grade - 8);
		System.out.println("Decrypted Grade: " + grade);
		
	}

}
