package Arrays;

import java.util.Scanner;

public class Second_Largest_Element {

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
		
		//Second Largest Element
		int max1 = arr[0];
		int max2 = arr[0];
		for(int i=0; i<size; i++)
		{
			if(arr[i]>max1)
			{
				max2=max1;
				max1 = arr[i];
			}
			else if(arr[i]>max2)
			{
				max2 = max1;
			}
				
		}
		
	
		System.out.println(max1 + " " + max2);
		System.out.println("The second largest element in array is: " + max2);

	}

}
