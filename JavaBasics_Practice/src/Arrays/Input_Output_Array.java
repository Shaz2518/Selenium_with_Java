package Arrays;

import java.util.Scanner;

public class Input_Output_Array {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int size = scr.nextInt();
		int[] arr = new int[size];
		
		//Take Input of Array Elements
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<size; i++)
		{
			arr[i] = scr.nextInt();
		}
		
		//Displaying Array Elements
		System.out.println("Array Elements are: ");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
