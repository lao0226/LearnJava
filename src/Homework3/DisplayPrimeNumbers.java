package Homework3;

public class DisplayPrimeNumbers {

	public static void main(String[] args) {
		//define a column and row
		int column=0;
		int row=0;
		
		//first for loop is used to generate all numbers from 2 to infinity. The second for loop is to detect whether the generated number is a prime number. 
		for(int i=2;i<Integer.MAX_VALUE;i++) {
			//define boolean variable, and test whether the number is a prime number.
			boolean isPrimeNumber=true;
			for(int k=2;k<i;k++) {
				if(i%k==0) {
					isPrimeNumber=false;
				}
			}
			
			//printout the result
			if(isPrimeNumber) {
				System.out.print(i+" ");
				column++;
			}
			
			//change to the next row when count becomes 10
			if(column==10) {
				column=0;
				System.out.println();
				row++;
			}
			
			//if row is greater than 5,break
			if(row==30) break;
			
		}
	}
}
