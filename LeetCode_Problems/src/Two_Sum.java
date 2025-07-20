
public class Two_Sum {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		int target = 8;
		int[] ans = new int[2];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target)
					
				{
					ans[0] = i;
					ans[1] = j;
					break;
				}
			}
		}
		System.out.println(ans[0] + " " + ans[1]);
	}

}
