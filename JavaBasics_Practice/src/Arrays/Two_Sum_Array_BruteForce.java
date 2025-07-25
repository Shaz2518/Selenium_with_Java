package Arrays;

public class Two_Sum_Array_BruteForce {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5 ,7 ,9};
		int num = 12;
		int[] ans = new int[2];

		// Two Sum
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == num) {
					ans[0] = i;
					ans[1] = j;
					break;
				}

			}

		}
		System.out.println(ans[0] + " " + ans[1]);
	}

}
