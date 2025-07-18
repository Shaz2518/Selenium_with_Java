package Arrays;

import java.util.Scanner;

public class Find_Element_X {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		//Array Size
		System.out.println("Enter size of an array");
		int size = scr.nextInt();
		int[] arr = new int[size];
		
		// Take array elements as input
		System.out.println("Enter array Elements: ");
		for(int i=0; i<size; i++)
			{
				arr[i] = scr.nextInt();
			}
		
		// Number to be searched
		System.out.println("Enter number to be searched");
		int num=scr.nextInt();
			
		//Finding Element
		boolean flag = false;
		for(int i=0; i<size; i++)
		{
			if(arr[i] == num)
				flag = true;
				break;
		}
		if(flag==true)
			System.out.println("Number Found ");
		else
			System.out.println("Number NOT Found");
	}

}
