package javaBasics;

public class OctalToDecimal {

	public static void main(String[] args) {

		long num = 100;
   		int decimal = convertOctaltoDecimal(num);
		System.out.println(decimal);
		
	}
	
	public static int convertOctaltoDecimal(long num) {
		
		long reminder;
		int i = 0, decimalnumber = 0;
		
		while(num != 0) {
			
			reminder = num % 10;
			num = num/10;
			
			decimalnumber += reminder * Math.pow(8, i);
			++i;
		}
		return decimalnumber;
	}

}
