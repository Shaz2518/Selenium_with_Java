package Arrays;

import java.util.Scanner;

public class Max_Of_Array {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		//Size of an Array
		System.out.println("Enter the size of an Array: ");
		int size = scr.nextInt();
		int[] arr = new int[size];
		
		//Take elements on an Array
		System.out.println("Enter elements of an Array: ");
		for(int i=0; i<size; i++)
		{
			arr[i] = scr.nextInt();
		}
		
		//Maximum number
		int max = arr[0];
		for(int i=1; i<size; i++)
		{
			if(arr[i] > max)
				max = arr[i];
			
		}
		System.out.println("Maximum Element in an Array is: " + max);

	}

}
