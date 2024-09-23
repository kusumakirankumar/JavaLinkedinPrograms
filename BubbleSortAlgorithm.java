package practice;

import java.util.Random;
import java.util.Scanner;

public class BubbleSortAlgorithm {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(500, 1000);
		}
		sc.close();
		displayElements(arr);
		bubbleSort(arr);
		displayElements(arr);
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int swap = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swap;
				}
			}
		}
	}

	public static void displayElements(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
