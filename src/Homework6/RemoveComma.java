package Homework6;

import java.util.Scanner;

public class RemoveComma {

	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//promopt user to enter a number
			System.out.println("Enter a number between 1,000 to 999,999 (q to quit):");
			String number=input.nextLine();
			if(number.equals("q")) break;
			
			//remove the comma
			String newNumber=removeComma(number);
			
			//print out the result
			System.out.println(newNumber);
		}
		input.close();
	}
	
	private static String removeComma(String number) {
		int length=number.length();
		if(length>7||length<4) {
			String errorStatement="The number is not in the range";
			return errorStatement;
		}
		String numberFirstPart=number.substring(0,length-4);
		String numberSecondPart=number.substring(length-3);
		String newNumber=numberFirstPart+numberSecondPart;
		return newNumber;
	}
}
