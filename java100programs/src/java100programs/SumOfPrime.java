//Write	a	program	to	find	SUM	OF	PRIME	numbers?
package java100programs;

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {

				sum += i;
			}
		}

		System.out.println("sum of prime numbers is: " + sum);
	}
}
