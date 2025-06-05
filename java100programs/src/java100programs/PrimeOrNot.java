//Write	a	program	to	check	whether	the	given	number	is	PRIME	or	not?
package java100programs;

import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number n: ");
		int n = sc.nextInt();
		int i;
		if (n == 1)
			System.out.println("prime starts from 2");

		for (i = 2; i < n; i++) {

			if (n % i == 0) {
				System.out.println(n + " is NOT PRIME number");
				break;
			}

		}
		
		if(n==i)
		System.out.println(n + " is PRIME number");

	}
}
