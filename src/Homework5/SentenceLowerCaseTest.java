package Homework5;

import java.util.Scanner;

public class SentenceLowerCaseTest {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//prompt user to enter a sentence
			System.out.println("Please enter a word or sentence(0 to quit):");
			String sentence=input.nextLine();
			if(sentence.equals("0")) break;
			
			
			//convert all the upper case to the lower case
			String sentenceLowerCase=sentenceLowerCase(sentence);
			
			//print the result
			System.out.println(sentenceLowerCase);
		}
		input.close();
	}
	
	private static String sentenceLowerCase(String sentenceNoPun) {
		String result="";
		for(int i=0;i<sentenceNoPun.length();i++) {
			result+=chToLowerCase(sentenceNoPun.charAt(i));
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
}
