package Homework5;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//prompt user to enter a sentence
			System.out.println("Please enter a word or sentence(0 to quit):");
			String sentence=input.nextLine();
			if(sentence.equals("0")) break;
			
			//remove punctuations
			String sentenceNoPunNoSpace=removePunAndSpace(sentence);
			
			//convert all the upper case to the lower case
			String sentenceLowerCase=sentenceLowerCase(sentenceNoPunNoSpace);
			
			//invert the whole sentence
			String invertedSentence=invertSentence(sentenceLowerCase);
			
			//compare two sentence and print out the result-
			if(invertedSentence.equals(sentenceLowerCase)) {
				System.out.println("The sentence/word is a Palindrome.");
			}
			else {
				System.out.println("The sentence/word is NOT a palindrome.");
			}
			
		}
		input.close();
	}
	
	private static String removePunAndSpace(String sentence) {
		String result="";
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)>='A' && sentence.charAt(i)<='Z' || sentence.charAt(i)>='a' && sentence.charAt(i)<='z') {
				result+=sentence.charAt(i);
			}
		}
		return result;
	}
	
	private static String sentenceLowerCase(String sentenceNoPunNoSpace) {
		String result="";
		for(int i=0;i<sentenceNoPunNoSpace.length();i++) {
			result+=chToLowerCase(sentenceNoPunNoSpace.charAt(i));
		}
		return result;
	}
	
	private static char chToLowerCase(char ch) {
		if(ch>='A'&&ch<='Z') {
			return (char)(ch-'A'+'a');
		}
		else {
			return ch;
		}
	}
	
	private static String invertSentence(String sentenceLowerCase) {
		String result="";
		for(int i=sentenceLowerCase.length()-1;i>=0;i--) {
			result+=sentenceLowerCase.charAt(i);
		}
		return result;
	}
}
