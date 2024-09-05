package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What year is it?");
		int year = in.nextInt();
		boolean four = (year% 4 == 0);
		System.out.println(four);
		boolean hundred = (year% 100 != 0);
		System.out.println(hundred);
		boolean fourh = (year% 400 == 0);
		System.out.println(fourh);
		boolean isLeapYear = (four && hundred || fourh);
		System.out.println(year + " is a leap year: " + isLeapYear);

	}

}
