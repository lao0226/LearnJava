package Homework5;

import java.util.Scanner;

public class ToTitle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//promote user to enter a title
			System.out.println("Plese enter a title(0 to quit):");
			String title=input.nextLine();
			if(title.equals("0")) break;
			
			//convert the first letter of the title to upper case
			String convertedTitle=toTitle(title);
			
			//print out the result
			System.out.println(convertedTitle);
		}
		input.close();
	}
	/**
	 * Capitalize the first letter of every word in the String
	 * classify type of character and combine the character to become a String result.
	 * precondition:all the character in the String is lower case
	 * @param str a String that is all lower case
	 * @return result a String that Capitalize the first letter of every word
	 */
	private static String toTitle(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			if(i==0) {
				result+=toUpperCase(str.charAt(i));
			}
			else if(str.charAt(i-1)==' '){
				result+=toUpperCase(str.charAt(i));
			}
			else {
				result+=str.charAt(i);
			}
		}
		return result;
	}
	
	/**
	 * converts a character from lower case to upper case
	 * @param ch a character that is lower case
	 * @return a character that is upper case
	 */
	private static char toUpperCase(char ch) {
		return (char)(ch-'a'+'A');
	}
	
}
