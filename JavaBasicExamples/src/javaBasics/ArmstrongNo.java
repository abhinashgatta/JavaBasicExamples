package javaBasics;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {

		//int num = 374;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.");
		int no = scn.nextInt();
		int rem;
		int sum =0;
		int temp = no;
		
		while(no!=0)
		{
			int n = no%10;
			rem = n*n*n;
			sum = sum + rem;
			no = no/10;
		}
		if(sum == temp) {
			System.out.println(temp + " is Armstrong number");
		}else {
			System.out.println(temp + " is not a Armstrong number");
		}
	}

}
