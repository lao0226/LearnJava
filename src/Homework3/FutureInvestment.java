package Homework3;

public class FutureInvestment {

	public static void main(String[] args) {
		//define variable to store initial investment, interest rate and year
		double investment=10000;
		double interestRatePlusOne=1.05;
		int year=10;
		
		//calculate the interest rate using loop
		for(int i=0;i<year;i++) {
			investment*=interestRatePlusOne;
		}
		//print out the result 
		System.out.print("10 years later: "+investment+".");
	}
}
