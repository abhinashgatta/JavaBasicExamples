package javaBasics;

public class BinaryToDecimal {

	public static void main(String[] args) {

		long num = 100;
   		int decimal = convertBinarytoDecimal(num);
		System.out.println(decimal);
		
	}
	
	public static int convertBinarytoDecimal(long num) {
		
		long reminder;
		int i = 0, decimalnumber = 0;
		
		while(num != 0) {
			
			reminder = num % 10;
			num = num/10;
			
			decimalnumber += reminder * Math.pow(2, i);
			++i;
		}
		return decimalnumber;
	}

}
