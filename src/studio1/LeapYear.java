package studio1;

import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year");
		
		int year = scan.nextInt();
		boolean isLeapYear = true;
		
		boolean divisibleFour = true;
		boolean notDivisibleHundred = true;
		boolean divisibleFourHundred = true;
		
		divisibleFour = ((year % 4) == 0); 
		notDivisibleHundred = ((year % 100) != 0);
		divisibleFourHundred = ((year % 400) == 0);
		
		isLeapYear = ((divisibleFour == true) && ((notDivisibleHundred == true) || (divisibleFourHundred == true)));
		
		System.out.println(year+" is a leap year: "+isLeapYear);
		
		

	}

}
