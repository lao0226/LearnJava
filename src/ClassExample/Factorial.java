package ClassExample;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//prompt user to enter the length of factorial sequence
		Scanner input=new Scanner(System.in);
		System.out.print("How long do you want the result to be?");
		int length=input.nextInt();
		
		//display the factorial number
		for(int i=0;i<length;i++) {
			System.out.println(i+"! = "+factorial(i));
		}
		input.close();
	}
	
	private static int factorial(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result*=i;
		}
		return result;
	}
	
}
