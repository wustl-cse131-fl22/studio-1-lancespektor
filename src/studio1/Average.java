package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a number");
		int n1 = scan.nextInt();
		
		System.out.println("Enter a second number");
		int n2 = scan.nextInt();
		
		double average = ((double) (n1 + n2)) / 2;
		
		System.out.println("Average of the numbers is: "+average);
		

	}

}
