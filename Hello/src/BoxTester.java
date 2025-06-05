import java.util.Scanner;

public class BoxTester {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the width, Depth and heiht of the Box: ");
		Box b= new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(" "+b.getDimensions()+" ");
		System.out.println("Volume of box "+b.getVolumeOfBox());
		
//		System.out.println("Enter the side of a cube: ");
//		Box cube= new Box(sc.nextDouble());
	
//		System.out.println("Area of cube: "+cube.getAreaOfCube());
		
		Box c= new Box(10,20,30);
		boolean status= b.checkEquality(c);
		
//	status ? System.out.println("box is same") : System.out.println("Box is not equal");
		
		if(status)
			System.out.println("box is equal");
		else
			System.out.println("Box is not equal");
		sc.close();
		
		
		
	}

}
