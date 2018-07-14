package Homework4;

import java.util.Scanner;

public class FibonacciSequence2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			
			//prompt user to enter the length of the sequence
			System.out.println("How long would you like your Fibonacci Sequence be? (0 to quit):");
			int length=input.nextInt();
			if (length==0) break;
			
			//calculate the result, and print the result
			for(int i=0;i<length;i++) {
				System.out.print(Fib(i)+" ");
			}
			
			//next line
			System.out.println();
		}
		input.close();
	}
	
/**
 * A function of Fibonacci number. When enter the position of a Fibonacci number,
 * return the Fibonacci number at that position.
 * @param number the position of Fibonacci number
 * @return the Fibonacci number
 */
	private static int Fib(int number) {
		
		//define two numbers used to find the sum
		int number1=0;
		int number2=1;
		int futureNumber1=1;//used to store original number2
		
		//0 case
		if(number==0) {
			number2=0;
		}
		
		//using for loop to calculate
		for(int i=2;i<=number;i++) {
			futureNumber1=number2;//storing the original number2 for future defining number1
			number2=number1+number2;//get the result as well as defining number2 for next loop
			number1=futureNumber1;//defining number1 for next loop
		}
		
		//return the result
		return number2;
	}
}
