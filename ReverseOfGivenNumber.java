package practice;

import java.util.Scanner;

public class ReverseOfGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(reverseOfNumber(num));
	}

	public static int reverseOfNumber(int num) {
		int rev = 0;
		while (num != 0) {
			rev = 10 * rev + num % 10;
			num /= 10;
		}
		return rev;
	}
}
