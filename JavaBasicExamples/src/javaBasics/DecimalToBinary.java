package javaBasics;

public class DecimalToBinary {

	public static void main(String[] args) {

		
		long binary = convertDecimaltoBinary(156);
		System.out.println(binary);
	}

	public static long convertDecimaltoBinary(int num) {
		
		long binarynum = 0;
		
		int reminder = 1, i = 1;
		
		while(num != 0) {
			
			reminder = num % 2;
			num = num / 2;
			binarynum += reminder * i;
			i *= 10;
		}
		
		return binarynum;
		
	}
	
}
