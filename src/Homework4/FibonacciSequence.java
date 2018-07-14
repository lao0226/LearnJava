package Homework4;

import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true) {
			//prompt user to enter the length of Fibonacci number
			System.out.println("How many Fibonacci number do you want? (0 to quit):");
			int length=input.nextInt();
			if (length==0) break;
			
			//output the asked Fibonacci sequence
			for(int i=0;i<length;i++) {
				System.out.print(Fib(i)+" ");
			}
			
			//next line
			System.out.println();
			
		}
		input.close();
	}
	
	private static int Fib(int number) {
		
		//for number 0 and 1
		if(number==0) return 0;
		if(number==1) return 1;
		
		//define and initialized the value f0,f1,f2
		int f0=0;
		
		int f1=1;
		int f2=f0+f1;//the initial value of f2 is the for the number 2
		
		//using loop to calculate when number is greater than 2
		for(int i=2;i<number;i++) {
			f0=f1;
			f1=f2;
			f2=f0+f1;
		}
		
		//print out the result
		return f2;
      }
}
