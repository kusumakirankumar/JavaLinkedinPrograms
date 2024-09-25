package practice;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		sc.close();
		System.out.println(greatestNumberOfThree(num1, num2, num3));
		System.out.println(greatestNumberOfFour(num1, num2, num3, num4));
	}

	public static int greatestNumberOfThree(int num1, int num2, int num3) {
		int ans = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
		return ans;
	}

	public static int greatestNumberOfFour(int num1, int num2, int num3, int num4) {
		int ans = (num1 > num2) ? ((num1 > num3) ? ((num1 > num4) ? num1 : num4) : ((num3 > num4) ? num3 : num4))
				: ((num2 > num3) ? ((num2 > num4) ? num2 : num4) : ((num3 > num4) ? num3 : num4));
		return ans;
	}

}
