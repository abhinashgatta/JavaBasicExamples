package javaBasics;

import java.util.Scanner;

public class AlphabetIsVowelOrConsonant {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a character to check : ");
		char ch = reader.next().charAt(0);

		if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			
			System.out.println("Entered character is a vowel : " + ch);
		}
		else
			System.out.println("Entered character is a consonant : " + ch);
		
	}

}
