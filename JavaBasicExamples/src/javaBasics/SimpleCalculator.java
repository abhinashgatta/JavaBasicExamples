package javaBasics;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		double firstno = reader.nextDouble();
		double secondno = reader.nextDouble();
		
		System.out.println("Please enter an operator  (+ , - , *, /) : ");
		
		char operator = reader.next().charAt(0);
		
		double res=0;
		
		switch (operator) {
		case '+':
			res = firstno+secondno;
			break;

		case '-':
			res = firstno-secondno;
			break;

		case '*':
			res = firstno*secondno;
			break;
			
		case '/':
			res = firstno/secondno;
			break;

		default:
			System.out.println("Please pass the correct operator");
			break;
		}
		
		System.out.println(res);
	}

}
