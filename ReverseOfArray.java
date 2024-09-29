package practice;

import java.util.Random;
import java.util.Scanner;

public class ReverseOfArray {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10, 100);
		}
		sc.close();
		displayElements(arr);
		reverseOfArray(arr);
		displayElements(arr);
	}

	public static int[] reverseOfArray(int[] arr) {
		int left = 0, right = arr.length - 1;
		for (int i = left; i < right; i++) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return arr;
	}

	public static void displayElements(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
