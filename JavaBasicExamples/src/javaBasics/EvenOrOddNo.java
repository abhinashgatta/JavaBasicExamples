package javaBasics;

import java.util.Scanner;

public class EvenOrOddNo {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = reader.nextInt();
	
		if (num%2==0)
			System.out.println("Number  is a even no. :" + num);
		else
			System.out.println("Number is a odd no :  " + num);
	}

}
