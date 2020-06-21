package javaBasics;

public class CheckLeapYear {

	public static void main(String[] args) {

		//year which is divisible by 4 for all the century years which are ending with 00
		// century is leap year only when it is perfectly divisible by 400
		//1900 is not a leap year
		//2012 is a leap year
		
		int year = 2000;
		boolean leap = false;
		
		if(year % 4==0)
			if(year % 100 == 0)
				if(year % 400 == 0)
				{
					leap = true;
				}
				else {
					leap = false;
				}
			else {
				leap = true;
			}
		else {
			leap = false;
		}
		
		if(leap) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
		}
		
	}

