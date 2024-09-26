package practice;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 90, 10, 80, 20, 70, 30, 60, 40, 50 };
		int number = 70;
		int target = linearSearch(arr, number);
		if (target != -1) {
			System.out.println("Number found at " + target);
		} else {
			System.out.println("Number not found ");
		}
	}

	public static int linearSearch(int[] arr, int num) {
		for (int i = 1; i <= arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
}
