//Write	a	program	to	Print	REVERSE	of	N	to	1	numbers

package java100programs;
import java.util.Scanner;
public class PrintReverseNums {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of N: ");
		
		int N=sc.nextInt();
		
		
		for(int i=N;i>=1;i--) {
//			System.out.println(i);
			System.out.print(i+" ");
			
		}
		
	}

}
