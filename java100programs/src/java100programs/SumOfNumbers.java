//Write	a	program	to	display	sum	of	1	to	N	numbers?
package java100programs;
import java.util.*;
public class SumOfNumbers {

	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=N) {
			sum+=i;
			i++;
		}
		System.out.println("sum of 1 to "+N+" is : "+sum);
	}
}
