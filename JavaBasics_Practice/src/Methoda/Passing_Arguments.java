package Methoda;

public class Passing_Arguments {

	
	public static void Student(String name, int age, int std, char Grade)
	{
		System.out.println("Student name: " + name);
		System.out.println("Student age: " + age);
		System.out.println("Standard: " +  std + "  and Grade: " + Grade);
	}
	public static void main(String[] args) {
		Student("John",16,9,'B');

	}

}
