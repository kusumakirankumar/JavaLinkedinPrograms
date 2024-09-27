package practice;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		leapYearOrNot(year);
		sc.close();
	}

	public static void leapYearOrNot(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap year");
		}
	}
}
