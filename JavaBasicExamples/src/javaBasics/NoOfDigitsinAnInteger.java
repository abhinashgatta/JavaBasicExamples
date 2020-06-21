package javaBasics;

public class NoOfDigitsinAnInteger {

	public static void main(String[] args) {

		//1234- 4
		//12345- 5 
		
		 long num = 2;
		int count = 0;
		
		while(num!=0)
		{
			num = num/10; //123 12 1 0
			++count; //1 2 3 4
		}
		System.out.println("number of digits is : " + count);
	}

}
