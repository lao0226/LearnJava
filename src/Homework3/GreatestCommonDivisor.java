package Homework3;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		//prompt the user to input two integer
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the first integer:");
		int a=input.nextInt();
		System.out.println("Please enter the second integer:");
		int b=input.nextInt();
		
		//find out the bound which the smaller integer of the two
		int bound;
		if(a>b) {
			bound=b;
		}
		else {
			bound=a;
		}
		
		//define the initial value of GCD
		int gcd=1;
		
		//using loop to find GCD.GCD will change all the time, but the last GCD is the largest one
		for (int i=2;i<=bound;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		
		//print the result
		System.out.println("The greatest common divisor for "+a+" and "+b+" is "+gcd+".");
	}
}
