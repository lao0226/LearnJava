package ClassExample;

import java.util.Scanner;

public class StringToLowerCase {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//prompt user to enter a random Sentence that has upper and lower case
			System.out.println("Please enter a Sentence that has upper and lower case (0 to quit):");
			String sentence=input.nextLine();
			if(sentence.equals("0")) break;
			
			//convert the sentence to lower case
			String convertedSentence=STLC(sentence);
			
			//print out the result
			System.out.println(convertedSentence);
		}
		input.close();
	}
	/**
	 * It converts a sentence that combines upper and lower case to a sentence that only includes lower case
	 * It includes upperToLower method that converts single character from upper case to lower case
	 * It used the upperToLower method and combined the result of the method
	 * @param str a String that includes the whole sentence that has upper and lower case
	 * @return result a String that includes only the lower case 
	 */
	private static String STLC(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			result+=upperToLower(str.charAt(i));
		}
		return result;
	}
	
	/**
	 * It converts a upper case character to a lower case character if the original character is upper case
	 * It calculates the difference of the upper case character and the first upper case character 'A'
	 * It then add to the first lower case character a to form a lower case character number.
	 * At last it changes the type of the number to character
	 * @param ch a character that can be both upper and lower case
	 * @return ch a character that can only be lower case
	 */
	private static char upperToLower(char ch) {
		if(ch>='A' && ch<='Z') {
			return (char)(ch-'A'+'a');
		}
		else {
			return ch;
		}
	}
	
}
