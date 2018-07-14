package Homework1;
import java.util.Scanner;

public class FirstLastDigit {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter an interger:");
	    int number=input.nextInt();
		
	    int lastDigit=number%10;
	    
	    int oneLessDigit=(int)Math.log10(number);
		int power=(int)Math.pow(10, oneLessDigit);
		int firstDigit=number/power;
		
		System.out.println("Your first digit is "+firstDigit);
		System.out.println("Your last digit is "+lastDigit);
		
		input.close();
	}
}
