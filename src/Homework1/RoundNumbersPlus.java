package Homework1;
import java.util.Scanner;

public class RoundNumbersPlus {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a real number:");
		double x=input.nextDouble();
		
		double roundedNumber=(int)(x+0.5);
		System.out.println("The rounded number is "+roundedNumber);
		
		input.close();
	}
}
