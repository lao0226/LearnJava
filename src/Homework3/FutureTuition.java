package Homework3;

public class FutureTuition {

	public static void main(String[] args) {
		//define variables
		double inituition=10000;
		double increaseRatePlusOne=1.07;
		double tuition=10000;
		int years=0;
		
		//using while loop to calculate the year
		while(tuition<inituition*2) {
			tuition=tuition*=increaseRatePlusOne;
			years++;
		}
		
		//print result
		System.out.println("The tuition will double after "+years+" years.");
	}
}
