package practice;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 90, 10, 80, 20, 70, 30, 60, 40, 50 };
		int number = 70;
		linearSearch(arr, number);
	}

	public static void linearSearch(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.print(arr[i] + " found at " + (i + 1));
			}
		}
	}
}
