package Homework4;

import java.util.Scanner;

public class GCD3 {

public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			
			//prompt user to enter two integer
			System.out.println("Please enter the first integer(0 to quit):");
			int first=input.nextInt();
			if (first==0) break;
			System.out.println("Please enter the second integer(0 to quit)");
			int second=input.nextInt();
			if(second==0) break;
			
			//find and print the result
			System.out.println("The greatest common divisor between "+first+" and "+second+" is "+GCD(first,second)+".");
		}
		input.close();
	}
	
	/**
	 * Find the greatest common divisor between a and b
	 * @param a as an integer
	 * @param b as an integer
	 * @return The greatest common divisor of a and b
	 */
	private static int GCD(int a,int b) {
		
		//decide whether a or b is larger, and define the value of bound as the smaller integer
		int bound;
		if (a<b) {
			bound=a;
		}
		else {
			bound=b;
		}
		
		//initialize variable result as 1 and using for loop to calculate the GCD and give the value of GCD to result
		int result=1;
		for(int i=2;i<=bound;i++) {
			if(a%i==0&&b%i==0) {
				result=i;
			}
		}
		return result;
		
	}
}
