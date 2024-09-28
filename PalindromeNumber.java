package practice;

import java.util.Scanner;

public class PalindromeNumber {
	static int rev = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		palindromeNumber(num);
		if (num == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	public static int palindromeNumber(int num) {
		while (num != 0) {
			rev = 10 * rev + (num % 10);
			num /= 10;
		}
		return rev;
	}
}
