package java100programs;
import java.util.Scanner;
//Write	a	program	to	Print	1	to	N	numbers?	
		
public class Printnums {
	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of N: \n");
		int N= sc.nextInt();
		
		
		for(int i=1;i<=N;i++) {
//			System.out.println(i);
			System.out.print(i+" ");
		}
	}
}
