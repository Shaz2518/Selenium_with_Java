package Arrays;

import java.util.Scanner;

public class Sum_Of_Array {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = scr.nextInt();
		int[] arr = new int[size];
		int arr_Sum=0;
		
		// Take array elements as input
		System.out.println("Enter array Elements: ");
		for(int i=0; i<size; i++)
		{
			arr[i] = scr.nextInt();
			System.out.println(arr[i]);
		}
		
		
		//Adding array Elements
		for(int i=0; i<arr.length;i++)
		{
			arr_Sum +=arr[i];
		}
		System.out.println("Sum of Array Elements is: " + arr_Sum);
	}

}
