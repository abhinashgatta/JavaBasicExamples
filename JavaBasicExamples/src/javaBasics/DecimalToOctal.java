package javaBasics;

public class DecimalToOctal {

	public static void main(String[] args) {

		
		long octal = convertDecimaltoOctal(109);
		System.out.println(octal);
	}

	public static long convertDecimaltoOctal(int num) {
		
		long octalNum = 0;
		
		int reminder = 1, i = 1;
		
		while(num != 0) {
			
			reminder = num % 8;
			num = num / 8;
			octalNum += reminder * i;
			i *= 10;
		}
		
		return octalNum;
		
	}
	
}
