package Arrays;

public class Student_Marks {

	public static void main(String[] args) {
		int[] marks = { 45, 5, 90, 9, 87, 23, 72, 12};
		for(int i=0; i<marks.length; i++)
		{
			if(marks[i]<=35)
			{
				System.out.println("Students fail has roll number: " + i);
			}
		}

	}

}
