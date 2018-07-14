package Homework4;

import java.util.Scanner;

public class PerfectSquareNumber {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			
			//prompt user to enter a integer
			System.out.println("Please enter an integer(0 to quit):");
			int number=input.nextInt();
			if(number==0) break;
			
			if(isPerfectSquare(number)) {
				System.out.println(number+" is a perfect square");
			}
			else {
				System.out.println(number+" is not a perfect square");
			}
		}
		input.close();
	}
	
	/**
	 * Decide whether a number is a perfect square.
	 * Math.squrt() converts number from integer to double
	 * if number can be perfectly divided by its root. It is a perfect square.
	 * @param number an integer
	 * @return true(number is a perfect square) or false(number is not a perfect square)
	 */
	private static boolean isPerfectSquare(int number) {
		boolean isPerfectSquare;
		if(number%(Math.sqrt(number))==0) {
			isPerfectSquare=true;
		}
		else {
			isPerfectSquare=false;
		}
		return isPerfectSquare;
	}
}
