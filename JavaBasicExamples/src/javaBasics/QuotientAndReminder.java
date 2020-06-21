package javaBasics;

public class QuotientAndReminder {

	public static void main(String[] args) {

		int dividend = 10, divisor = 20, rem, quo;
		
		rem= dividend % divisor;
		quo = dividend / divisor;
		System.out.println("The reminder of dividend and divisor is : " + rem);
		System.out.println("The quotient of dividend and divisor is : " + quo);
		
	}

}
