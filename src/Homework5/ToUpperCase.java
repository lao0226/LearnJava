package Homework5;

import java.util.Scanner;

public class ToUpperCase {

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//prompt user to enter a word
			System.out.println("Please enter a word or sentence(0 to quit):");
			String sentence=input.nextLine();
			if(sentence.equals("0")) break;
			
			//convert it to Upper case
			String upperCaseSentence=upperCase(sentence);
			
			//print out the result
			System.out.println(upperCaseSentence);
			
		}
		input.close();
	}
	
	/**
	 * Changes all the character in the String to upper case letter
	 * Classify types of character and combine characters to become result
	 * @param str a String that consists of both upper case or lower case number, or only lower case number 
	 * @return result a String that consists of only upper case letters
	 */
	private static String upperCase(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				result+=toUpper(str.charAt(i));
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
	private static char toUpper(char ch) {
		return (char)(ch-'a'+'A');
		}
	}
