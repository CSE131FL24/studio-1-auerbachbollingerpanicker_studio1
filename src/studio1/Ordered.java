package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		boolean compare1 = x > y;
		boolean compare2 = y > z;
		boolean compare3 = x < y; 
		boolean compare4 = y < z; 
		
		boolean ordered1 = compare1 && compare2; 
		boolean ordered2 = compare3 && compare4; 
		
		boolean isOrdered = ordered1 || ordered2; 
		
		System.out.println(isOrdered);
	}

}
