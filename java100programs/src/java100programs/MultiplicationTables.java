//Write	a	program	to	display	MULTIPLICATION	TABLES?	
package java100programs;

import java.util.*;

public class MultiplicationTables {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.printf(j + "*" + i + "=" + j * i+"\t");
//				System.out.printf("*");
			}
//			System.out.println("table of " + i);
			System.out.println("");
		}

	}
}
