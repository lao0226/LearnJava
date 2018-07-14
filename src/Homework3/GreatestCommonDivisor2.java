package Homework3;

import java.util.Scanner;

public class GreatestCommonDivisor2 {

	public static void main(String[] args) {
		//prompt user to enter two integer
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the first integer: ");
		int a=input.nextInt();
		System.out.println("Please enter the second integer: ");
		int b=input.nextInt();
		
		//set the smaller one as bound
		int bound;
		if(a>b) {
			bound=b;
		}
		else {
			bound=a;
		}
		
		//give GCD an initial value
		int gcd=1;
		for(int i=2;i<=bound;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		
		//print the result
		System.out.println("The greatest common divisor for "+a+" and "+b+" is "+gcd+".");
	
		
	}
}
