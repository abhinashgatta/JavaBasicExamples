package javaBasics;

public class SwaptwoNos {

	public static void main(String[] args) {
	
		int a =10, b =20;
		/*System.out.println("Before swapping : ");
		System.out.println("a = " +a );
		System.out.println("b = " +b );
		System.out.println("After Swapping");
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " +a );
		System.out.println("b = " +b );
		*/
		
		//Without Temporary variable
		
		System.out.println("Before swapping : ");
		System.out.println("a = " +a );
		System.out.println("b = " +b );
		
		System.out.println("After Swapping");
		
		a= a-b;
		b = a+b;
		a = b-a;
		
		System.out.println("a = " +a );
		System.out.println("b = " +b );
		
	}

}
