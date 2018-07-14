package Homework4;

import java.util.Scanner;

public class SumRange {

	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
		while(true) {
			//prompt user to input a low and a high number
			System.out.println("Please enter the low number(zero to quit):");
			int low=input.nextInt();
			if(low==0) break;
			System.out.println("Please enter the high number(zero to quit):");
			int high=input.nextInt();
			if(high==0) break;
			
			//Print the result
			System.out.println("The sum from "+low+" to "+high+" is "+sumRange(low,high)+".");
		}
		input.close();
	}
	
	/**
	 * Get the sum of integer from a to b
	 * Precondition: a is always smaller than b
	 * @param a an integer
	 * @param b an integer
	 * @return the sum of the integer from a to b
	 */
	private static int sumRange(int a, int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		return sum;
	}
}
