package Arrays;

import java.util.Scanner;

public class Count_of_Greater_Number {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		// Size of an Array
		System.out.println("Enter the size of an Array: ");
		int size = scr.nextInt();
		int[] arr = new int[size];

		// Take elements on an Array
		System.out.println("Enter elements of an Array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = scr.nextInt();
		}

		// Element to be compared
		System.out.println("Enter an element to be compared");
		int num = scr.nextInt();

		// Comparison
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] > num) {
				count++;
			}
		}
		System.out.println("The number of elements greater than user number is: " + count);
	}

}
