package javaBasics;

import java.util.Scanner;

public class PrintanInteger {

	public static void main(String[] args) {

		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = reader.nextInt();
		System.out.println("Entered number :" +num);
	}

}
