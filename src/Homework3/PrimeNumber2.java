package Homework3;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=input.nextInt();
		boolean isInteger=true;
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isInteger=false;
			}
		}
		
		if(isInteger) {
			System.out.println("The number is a prime number.");
		}
		else {
			System.out.println("The number is not a prime number.");
		}
		input.close();
	}
}
