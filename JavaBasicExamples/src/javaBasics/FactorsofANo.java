package javaBasics;

import java.util.Scanner;

public class FactorsofANo {

	public static void main(String[] args) {

		
		// 10 - 1 2 5 10
		// 60 - 1 2 3 4 5 6 10 15 20 30 60
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number to find out the Factor");
		
		int num = scan.nextInt();
		
		for (int i = 1; i<= num ; i++) {
		
			if(num%i == 0) {
			
				System.out.println(i + " ");
			}
		}
	}

}
