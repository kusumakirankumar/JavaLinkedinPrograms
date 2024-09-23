package practice;

import java.util.Scanner;

public class PrimeOrNotPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if (isPrime(num)) {
			System.out.println(num + " is Prime number");
		} else {
			System.out.println(num + " is not Prime number");
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
