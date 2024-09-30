package practice;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10, 500);
		}
		displayElements(arr);
		sortArray(arr);
		displayElements(arr);
		int target = sc.nextInt();
		sc.close();
		System.out.println(binarySearch(arr, 0, arr.length - 1, target));
	}

	public static int[] sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int binarySearch(int[] arr, int left, int right, int k) {
		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 2;

		if (arr[mid] == k)
			return mid;
		if (arr[mid] > k) {
			return binarySearch(arr, left, mid - 1, k);
		} else {
			return binarySearch(arr, mid + 1, right, k);
		}
	}

	public static void displayElements(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
