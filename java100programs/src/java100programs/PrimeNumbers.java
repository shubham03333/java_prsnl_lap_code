//Write	a	program	to	display	PRIME	NUMBERS	from	1	to	n?	
package java100programs;

import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		// prime number starts from 2 so i =2
		// and if any number is not divisible by any number from 2 to the square root of
		// that number is called prime number
		
				
		for(int i=2;i<=n;i++) {
			
			boolean isPrime=true;
			
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
				break;
				}
			}
			if(isPrime)
			System.out.println(i);
		}

			
		

	}

}
