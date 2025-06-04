
public class Hello {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello Shubham lets crack it");
//		
//
//	}
	
	int a=20;
	
//	public static void main(String[] args) {
//		
//		int i=10;
//		Hello obj= new Hello();
//		System.out.println("val of i = "+ i);
//		System.out.println("val of instance var = "+obj.a);
//		
//
//	}
	
	public static void main(String[] args) {
		
		int i= Integer.parseInt(args[0]);
		int j= Integer.parseInt(args[1]);
//		Hello obj= new Hello();
		
		System.out.println("val of i = "+ i);
		System.out.println("val of j = "+ j);
		System.out.println("val of j = "+ args[0].getClass());
		
//		System.out.println("val of instance var = "+obj.a);
		

	}

}
