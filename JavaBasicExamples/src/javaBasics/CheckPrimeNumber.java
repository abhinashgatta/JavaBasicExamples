package javaBasics;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
				/*
				 
				34 = 3 + 31
				34 = 5 + 29
				34 = 11 + 23
				34 = 17 + 17
				
				*/
		// System.out.println(checkPrimenumber(34));
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter a number");

		int num = reader.nextInt();
		
		boolean flag = false;
		
		for(int i = 2; i<= num/2; i++) {
			
			if(checkPrimenumber(i)) {
				
				if(checkPrimenumber(num-i)) {
					System.out.println(num + " = " + i + " + " + (num-i));
					flag= true;
				}
			}
		}
		
		if(!flag) {
			System.out.println(num + " cannot be expressed as the Sum of Two Prime Numbers");
		}
	
	}
		
	public static boolean checkPrimenumber(int num) {
		
		boolean isPrime = true;
		for (int i = 2; i<=num/2; i++) {
			if(num%i == 0) {
			isPrime = false;
			break;
			}
		}
		return isPrime;
		
	}
}

