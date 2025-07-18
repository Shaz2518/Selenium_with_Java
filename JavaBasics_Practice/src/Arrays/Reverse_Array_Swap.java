package Arrays;

public class Reverse_Array_Swap {

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 83, 11, 38, 69, 72, 45, 15, 91 };
		int i = 0, j = arr.length - 1;

		System.out.println("Before Reverse: ");
		print(arr);
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println("After Reverse: ");
		print(arr);

	}

}
