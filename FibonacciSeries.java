package practice;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int count = sc.nextInt();
		fibonacciSeries(num1, num2, count);
		sc.close();
	}

	public static void fibonacciSeries(int num1, int num2, int count) {
		int num3 = 0;
		System.out.print(num1 + " " + num2);
		for (int i = 2; i <= count; i++) {
			num3 = num1 + num2;
			System.out.print(" " + num3 + " ");
			num1 = num2;
			num2 = num3;
		}
	}
}
