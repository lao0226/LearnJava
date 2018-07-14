package Homework6;

import java.util.Scanner;

public class RemoveCommaIndex {

	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//promopt user to enter a number
			System.out.println("Enter a number between 1,000 to 999,999 (q to quit):");
			String number=input.nextLine();
			if(number.equals("q")) break;
			
			//find out the length of the number and check if it is in range
			int length=number.length();
			if(length<4||length>7) {
				System.out.println("The number is not in the range.");
				continue;
			}
			
			//remove the comma
			String newNumber=removeComma(number);
			
			//print out the result
			System.out.println(newNumber);
		}
		input.close();
	}
	
	private static String removeComma(String number) {
		int index=number.indexOf(',');
		String numberFirstPart=number.substring(0, index);
		String numberSecondPart=number.substring(index+1);
		String newNumber=numberFirstPart+numberSecondPart;
		return newNumber;
	}
}
