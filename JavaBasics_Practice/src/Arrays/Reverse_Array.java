package Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		int[] arr = { 83, 11, 38, 69, 72};
		int[] rev = new int[arr.length];
		
		System.out.println("Before Reverse: " );
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// Reverse Array
		System.out.println("After Reverse: ");
		for(int i=0; i<arr.length; i++)
		{
			rev[i] = arr[arr.length-i-1];
			System.out.print(rev[i]+ " ");
		}

	}

}
