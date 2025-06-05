//Write	a	program	to	check	given	number	is	EVEN	or	ODD?	

package java100programs;

import java.util.*;

public class EvenOrOdd {
	
	public static void main (String [] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of N: ");
	int N= sc.nextInt();
	
	if(N%2==0)
		System.out.println(N+" is Even");
	else
		System.out.println(N+" is ODD");
	
	}

}
