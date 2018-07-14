package Homework3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//prompt user to enter an integer
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int number=input.nextInt();
		
		//define a boolean variable
		boolean isPrimeNumber=true;
		
		//using for loop to determine if it is a prime number
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrimeNumber=false;
			}
		}
		
		//print the result
		if(isPrimeNumber) {
			System.out.println("It is a prime number.");
		}
		else {
			System.out.println("It is not a prime number.");
		}
	}
}
